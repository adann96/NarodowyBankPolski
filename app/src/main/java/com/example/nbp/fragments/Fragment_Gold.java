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
import com.example.nbp.GoldDatesActivity;
import com.example.nbp.R;
import com.example.nbp.RankActivity;
import com.example.nbp.WorldCurrencyRatesActivity;

public class Fragment_Gold extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gold, container, false);

        CardView goldRate = view.findViewById(R.id.goldRate);
        CardView datesOfRates = view.findViewById(R.id.datesOfRates);
        CardView goldCalc = view.findViewById(R.id.goldCalc);
        CardView aboutApp = view.findViewById(R.id.aboutApp);

        /*
        goldRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EurCurrencyRatesActivity.class);
                startActivity(intent);
            }
        });*/
        datesOfRates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GoldDatesActivity.class);
                startActivity(intent);
            }
        });
        /*
        goldCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WorldCurrencyRatesActivity.class);
                startActivity(intent);
            }
        });
        aboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Calculation.class);
                startActivity(intent);
            }
        });*/

        return view;
    }
}