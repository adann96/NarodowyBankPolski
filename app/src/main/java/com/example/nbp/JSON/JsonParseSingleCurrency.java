package com.example.nbp.JSON;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.nbp.Currency;
import com.example.nbp.RankActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JsonParseSingleCurrency {

    public JsonParseSingleCurrency() {
    }

    public static void jsonParsing(String url, String property, Context context, RequestQueue requestQueue, TextView textView) {
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                progressDialog.dismiss();
                try {
                    JSONArray jsonArray = response.getJSONArray("rates");
                    textView.append(jsonArray.getJSONObject(0).get(property).toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(context.getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
        requestQueue.add(request);
    }

    public static void jsonParsingCurrRanking(String url, ListView listView, Context context, RequestQueue requestQueue) {
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading...");
        progressDialog.show();


        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(JSONArray response) {
                try {
                    ArrayList<Currency> arrayList = new ArrayList<>();
                    JSONObject obj = response.getJSONObject(0);
                    JSONArray jsonArray = obj.getJSONArray("rates");
                    Currency currency = null;

                    for (int i = 0; i < 35; i++) {
                        String codeJson = jsonArray.getJSONObject(i).get("code").toString();
                        String currencyJson = jsonArray.getJSONObject(i).get("currency").toString();
                        float midJson = Float.parseFloat(jsonArray.getJSONObject(i).get("mid").toString());

                        currency = new Currency(codeJson,currencyJson,midJson);
                        arrayList.add(currency);
                    }

                    Collections.sort(arrayList, Comparator.comparing(Currency::getMidJson));
                    Collections.reverse(arrayList);

                    ArrayAdapter<Currency> arrayAdapter = new ArrayAdapter(context,android.R.layout.simple_list_item_1,arrayList);
                    listView.setAdapter(arrayAdapter);
                    progressDialog.dismiss();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(context.getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
                Log.d("ERROR uuu", error.getMessage());
            }
        });
        requestQueue.add(request);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context,"Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
