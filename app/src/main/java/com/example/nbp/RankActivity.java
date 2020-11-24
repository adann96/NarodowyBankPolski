package com.example.nbp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.database.Cursor;
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
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.nbp.Database.Currency;
import com.example.nbp.Database.DatabaseHelper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

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
            @Override
            public void onResponse(JSONArray response) {
                progressDialog.dismiss();
                try {
                    ArrayList<String> arrayList = new ArrayList<>();
                    JSONObject obj = response.getJSONObject(0);
                    JSONArray jsonArray = obj.getJSONArray("rates");
                    DatabaseHelper db = new DatabaseHelper(RankActivity.this);
                    db.truncateData();

                    for (int i = 0; i < 35; i++) {
                        String codeJson = jsonArray.getJSONObject(i).get("code").toString();
                        String currencyJson = jsonArray.getJSONObject(i).get("currency").toString();
                        float midJson = Float.parseFloat(jsonArray.getJSONObject(i).get("mid").toString());

                        Currency currency = new Currency(codeJson,currencyJson,midJson);

                        db.addOne(currency.getCode(), currency.getCurrency(), currency.getMid());
                    }

                    Cursor cursor = db.readData();

                    for (int y = 0; y < arrayList.size(); y++) {
                        arrayList.add(cursor.getString(1) + " | " + cursor.getString(2)  + " | " +  cursor.getString(3));
                    }

                    ArrayAdapter arrayAdapter = new ArrayAdapter(RankActivity.this,android.R.layout.simple_list_item_1,arrayList);
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

