package com.example.nbp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.nbp.JSON.JsonParseSingleCurrency;

public class GoldRanking extends AppCompatActivity {
    private RequestQueue requestQueue;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_ranking);

        requestQueue = Volley.newRequestQueue(this);

        listView = (ListView) findViewById(R.id.goldRank);

        JsonParseSingleCurrency.jsonParsingGoldRanking("https://api.nbp.pl/api/cenyzlota/last/30/?format=json",
                listView, GoldRanking.this, requestQueue);
    }
}