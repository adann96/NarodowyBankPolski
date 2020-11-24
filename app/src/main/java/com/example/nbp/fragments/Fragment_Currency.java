package com.example.nbp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nbp.CurrencyRatesActivity;
import com.example.nbp.R;
import com.example.nbp.RankActivity;

public class Fragment_Currency extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_currency, container, false);

        CardView cardViewMe = view.findViewById(R.id.audCurrency);
        CardView currRank = view.findViewById(R.id.currRank);

        cardViewMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CurrencyRatesActivity.class);
                startActivity(intent);
            }
        });
        currRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RankActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}