package com.example.nbp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
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
import com.example.nbp.JSON.JsonParseSingleCurrency;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;
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

        JsonParseSingleCurrency.jsonParsingCurrRanking("https://api.nbp.pl/api/exchangerates/tables/A/?format=json",
                listView, RankActivity.this, requestQueue);
    }
}

