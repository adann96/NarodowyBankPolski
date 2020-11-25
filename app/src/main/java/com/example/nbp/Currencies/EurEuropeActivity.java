package com.example.nbp.Currencies;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.nbp.JSON.JsonParseSingleCurrency;
import com.example.nbp.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

public class EurEuropeActivity extends AppCompatActivity {
    private TextView eurRate, changePercentEur, changePercentZl;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eur_europe);
        eurRate = findViewById(R.id.eurRateValue);
        changePercentZl = findViewById(R.id.changePercentZlValue);
        changePercentEur = findViewById(R.id.changePercentEurValue);

        requestQueue = Volley.newRequestQueue(this);
        JsonParseSingleCurrency jsonParse = new JsonParseSingleCurrency("mid");
        String param = jsonParse.getProperty();

        jsonParsing(param);
        barChartCurrRates();
    }

    public void jsonParsing(final String param) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        String url = "https://api.nbp.pl/api/exchangerates/rates/A/EUR/?format=json";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                progressDialog.dismiss();
                try {
                    JSONArray jsonArray = response.getJSONArray("rates");
                    eurRate.append(jsonArray.getJSONObject(0).get(param).toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        requestQueue.add(request);
    }

    private void barChartCurrRates() {
        String url = "https://api.nbp.pl/api/exchangerates/rates/A/EUR/last/5/?format=json";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                BarChart barChart = findViewById(R.id.eurBarChart);
                ArrayList<BarEntry> currRates = new ArrayList<>();
                try {
                    int i;
                    JSONArray jsonArray = response.getJSONArray("rates");
                    for (i = 0; i<5; i++) {
                        //String date = jsonArray.getJSONObject(i).get("effectiveDate").toString();
                        String rate = jsonArray.getJSONObject(i).get("mid").toString();
                        currRates.add(new BarEntry(i+1, Float.parseFloat(rate)));
                    }

                    String up = new StringBuilder().appendCodePoint(0xFFEA).toString();
                    String down = new StringBuilder().appendCodePoint(0xFFEC).toString();
                    double differenceFloat = Math.abs((currRates.get(4).getY()) - (currRates.get(3).getY()));
                    double differencePercentage = ((1 - currRates.get(4).getY()) / (currRates.get(3).getY()));

                    if (differenceFloat > 0 && differencePercentage > 0) {
                        changePercentZl.append(up + " +" + differenceFloat);
                        changePercentEur.append(up + " +" + differencePercentage + "%");
                    }
                    else if (differenceFloat == 0 && differencePercentage == 0) {
                        changePercentZl.append("brak");
                        changePercentEur.append("brak");
                    }
                    else {
                        changePercentZl.append(down + " -" + differenceFloat);
                        changePercentEur.append(down + " " + Math.round(differencePercentage * 10000)/10000.0 + "%");
                    }

                    BarDataSet barDataSet = new BarDataSet(currRates,"Last 5 days rates");
                    barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
                    barDataSet.setValueTextColor(Color.BLACK);
                    barDataSet.setValueTextSize(15f);

                    BarData barData = new BarData(barDataSet);

                    barChart.setFitBars(true);
                    barChart.setData(barData);
                    barChart.animateY(1000);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        requestQueue.add(request);
    }
}