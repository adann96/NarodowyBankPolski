package com.example.nbp.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nbp.Calculation;
import com.example.nbp.EurCurrencyRatesActivity;
import com.example.nbp.GoldRanking;
import com.example.nbp.R;
import com.example.nbp.RankActivity;
import com.example.nbp.WorldCurrencyRatesActivity;

public class Fragment_Gold extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gold, container, false);

        CardView datesOfRates = view.findViewById(R.id.datesOfRates);
        /*
        CardView currRank = view.findViewById(R.id.currRank);
        CardView globRates = view.findViewById(R.id.globalRates);
        CardView currCalculator = view.findViewById(R.id.calculatorActivity);*/

        datesOfRates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GoldRanking.class);
                startActivity(intent);
            }
        });
        /*
        currRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RankActivity.class);
                startActivity(intent);
            }
        });
        globRates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WorldCurrencyRatesActivity.class);
                startActivity(intent);
            }
        });
        currCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Calculation.class);
                startActivity(intent);
            }
        });*/

        return view;
    }
}