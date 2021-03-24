package com.example.nbp.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.nbp.JSON.JsonParseSingleCurrency;
import com.example.nbp.R;

public class Fragment_Gold extends Fragment {
    private RequestQueue requestQueue;
    ListView listView;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gold, container, false);

        requestQueue = Volley.newRequestQueue(getContext());
        listView = (ListView) view.findViewById(R.id.goldRank);

        JsonParseSingleCurrency.jsonParsingGoldRanking("https://api.nbp.pl/api/cenyzlota/last/30/?format=json",
                listView, getContext(), requestQueue);

        return view;
    }
}