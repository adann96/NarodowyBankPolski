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

public class GbpGreatBritainActivity extends AppCompatActivity {
    private TextView mTextViewResult;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gbp_great_britain);
        mTextViewResult = findViewById(R.id.gbpCurrencyRate);

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

        String url = "https://api.nbp.pl/api/exchangerates/rates/A/GBP/?format=json";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                progressDialog.dismiss();
                try {
                    JSONArray jsonArray = response.getJSONArray("rates");
                    mTextViewResult.append(jsonArray.getJSONObject(0).get(param).toString());
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
        String url = "https://api.nbp.pl/api/exchangerates/rates/A/gbp/last/5/?format=json";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                BarChart barChart = findViewById(R.id.gbpBarChart);
                ArrayList<BarEntry> currRates = new ArrayList<>();
                try {
                    int i;
                    JSONArray jsonArray = response.getJSONArray("rates");
                    for (i = 0; i<5; i++) {
                        //String date = jsonArray.getJSONObject(i).get("effectiveDate").toString();
                        String rate = jsonArray.getJSONObject(i).get("mid").toString();
                        currRates.add(new BarEntry(i+1, Float.parseFloat(rate)));
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