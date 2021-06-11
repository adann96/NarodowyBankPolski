package com.example.nbp.Currencies;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.icu.number.Precision;
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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class RubRussiaActivity extends AppCompatActivity {
    private TextView mTextViewResult, dateStatusValue;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rub_russia);
        mTextViewResult = findViewById(R.id.rubRateValue);
        requestQueue = Volley.newRequestQueue(this);
        dateStatusValue = findViewById(R.id.dateStatusValue);
        JsonParseSingleCurrency.jsonParsing("https://api.nbp.pl/api/exchangerates/rates/A/rub/?format=json","mid",this,requestQueue,mTextViewResult);

        barChartCurrRates();
    }

    private void barChartCurrRates() {
        String url = "https://api.nbp.pl/api/exchangerates/rates/A/RUB/last/5/?format=json";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                BarChart barChart = findViewById(R.id.rubBarChart);
                ArrayList<BarEntry> currRates = new ArrayList<>();
                try {
                    int i;
                    JSONArray jsonArray = response.getJSONArray("rates");
                    for (i = 0; i<5; i++) {
                        String rate = jsonArray.getJSONObject(i).get("mid").toString();
                        currRates.add(new BarEntry(i, Float.parseFloat(rate)));
                        if (i == 4) {
                            String dateStatus = jsonArray.getJSONObject(i).get("effectiveDate").toString();
                            dateStatusValue.setText(dateStatus);
                        }
                    }

                    BarDataSet barDataSet = new BarDataSet(currRates,"Last 5 days rates");
                    barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
                    barDataSet.setValueTextColor(Color.BLACK);
                    barDataSet.setValueTextSize(15f);

                    BarData barData = new BarData(barDataSet);

                    barChart.setFitBars(true);
                    barChart.setData(barData);
                    barChart.animateXY(1000,1000);
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