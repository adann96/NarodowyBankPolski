package com.example.nbp.Currencies;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UsdAmericaActivity extends AppCompatActivity {
    private TextView mTextViewResult;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usd_america);
        mTextViewResult = findViewById(R.id.usdAmericaRate);

        requestQueue = Volley.newRequestQueue(this);
        JsonParseSingleCurrency jsonParse = new JsonParseSingleCurrency("mid");
        String param = jsonParse.getProperty();

        jsonParsing(param);
    }

    public void jsonParsing(final String param) {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        String url = "https://api.nbp.pl/api/exchangerates/rates/A/USD/?format=json";
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
}