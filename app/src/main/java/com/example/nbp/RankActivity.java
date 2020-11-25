package com.example.nbp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RankActivity extends AppCompatActivity {
    private RequestQueue requestQueue;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);
        requestQueue = Volley.newRequestQueue(this);

        listView = (ListView) findViewById(R.id.currenciesRank);

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        String url = "https://api.nbp.pl/api/exchangerates/tables/A/?format=json";
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(JSONArray response) {
                progressDialog.dismiss();
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

                    ArrayAdapter<Currency> arrayAdapter = new ArrayAdapter(RankActivity.this,android.R.layout.simple_list_item_1,arrayList);
                    listView.setAdapter(arrayAdapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
                Log.d("ERROR uuu", error.getMessage());
            }
        });
        requestQueue.add(request);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RankActivity.this,"Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

