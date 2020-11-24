package com.example.nbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nbp.Currencies.BgnBulgariaActivity;
import com.example.nbp.Currencies.ChfSwitzerlandActivity;
import com.example.nbp.Currencies.CzkCechRepublicActivity;
import com.example.nbp.Currencies.DkkDenmarkActivity;
import com.example.nbp.Currencies.EurEuropeActivity;
import com.example.nbp.Currencies.GbpGreatBritainActivity;
import com.example.nbp.Currencies.HrkCroatiaActivity;
import com.example.nbp.Currencies.HufHungaryActivity;
import com.example.nbp.Currencies.IskIcelandActivity;
import com.example.nbp.Currencies.NokNorwayActivity;
import com.example.nbp.Currencies.RonRomaniaActivity;
import com.example.nbp.Currencies.RubRussiaActivity;
import com.example.nbp.Currencies.SekSwedenActivity;
import com.example.nbp.Currencies.TryTurkeyActivity;
import com.example.nbp.Currencies.UahUkraineActivity;

public class CurrencyRatesActivity extends AppCompatActivity {

    CardView thbCurrButton, usdCurrButton, audCurrButton, hkdCurrButton, cadCurrButton, ndzCurrButton, sgdCurrButton, eurCurrButton, hufCurrButton, chfCurrButton,
    gbpCurrButton, uahCurrButton, jpyCurrButton, czkCurrButton, dkkCurrButton, iskCurrButton, nokCurrButton, sekCurrButton, hrkCurrButton, ronCurrButton, bgnCurrButton, tryCurrButton,
    ilsCurrButton, clpCurrButton, phpCurrButton, mxnCurrButton, zarCurrButton, brlCurrButton, myrCurrButton, rubCurrButton, idrCurrButton, inrCurrButton, krwCurrButton, cnyCurrButton, xdrCurrButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eur_currency_rates);

        //thbCurrButton = findViewById(R.id.thbCurrency);
        //usdCurrButton = findViewById(R.id.usdCurrency);
        //audCurrButton = findViewById(R.id.audCurrency);
        //hkdCurrButton = findViewById(R.id.hkdCurrency);
        //cadCurrButton = findViewById(R.id.cadCurrency);
        //ndzCurrButton = findViewById(R.id.ndzCurrency);
        //sgdCurrButton = findViewById(R.id.sgdCurrency);
        eurCurrButton = findViewById(R.id.eurCurrency);
        hufCurrButton = findViewById(R.id.hufCurrency);
        chfCurrButton = findViewById(R.id.chfCurrency);
        gbpCurrButton = findViewById(R.id.gbpCurrency);
        uahCurrButton = findViewById(R.id.uahCurrency);
        /*
        jpyCurrButton = findViewById(R.id.);*/
        czkCurrButton = findViewById(R.id.czkCurrency);
        dkkCurrButton = findViewById(R.id.dkkCurrency);
        iskCurrButton = findViewById(R.id.iskCurrency);
        nokCurrButton = findViewById(R.id.nokCurrency);
        sekCurrButton = findViewById(R.id.sekCurrency);
        hrkCurrButton = findViewById(R.id.hrkCurrency);
        ronCurrButton = findViewById(R.id.ronCurrency);
        bgnCurrButton = findViewById(R.id.bgnCurrency);
        tryCurrButton = findViewById(R.id.tryCurrency);
        /*
        ilsCurrButton = findViewById(R.id.);
        clpCurrButton = findViewById(R.id.);
        phpCurrButton = findViewById(R.id.);
        mxnCurrButton = findViewById(R.id.);
        zarCurrButton = findViewById(R.id.);
        brlCurrButton = findViewById(R.id.);
        myrCurrButton = findViewById(R.id.);
        */
        rubCurrButton = findViewById(R.id.rubCurrency);
        /*
        idrCurrButton = findViewById(R.id.);
        inrCurrButton = findViewById(R.id.);
        krwCurrButton = findViewById(R.id.);
        cnyCurrButton = findViewById(R.id.);
        xdrCurrButton = findViewById(R.id.);*/
        /*
        thbCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, ThbThailandActivity.class);
                startActivity(intent);
            }
        });
        usdCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, UsdAmericaActivity.class);
                startActivity(intent);
            }
        });
        audCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, AudAustraliaActivity.class);
                startActivity(intent);
            }
        });
        hkdCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, HkdHongkongActivity.class);
                startActivity(intent);
            }
        });
        cadCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, CadCanadaActivity.class);
                startActivity(intent);
            }
        });
        ndzCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, NzdNewZelandActivity.class);
                startActivity(intent);
            }
        });
        sgdCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, SgdSingaporeActivity.class);
                startActivity(intent);
            }
        });*/
        eurCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, EurEuropeActivity.class);
                startActivity(intent);
            }
        });
        hufCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, HufHungaryActivity.class);
                startActivity(intent);
            }
        });
        chfCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, ChfSwitzerlandActivity.class);
                startActivity(intent);
            }
        });
        gbpCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, GbpGreatBritainActivity.class);
                startActivity(intent);
            }
        });

        uahCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, UahUkraineActivity.class);
                startActivity(intent);
            }
        });/*
        jpyCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });*/
        czkCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, CzkCechRepublicActivity.class);
                startActivity(intent);
            }
        });
        dkkCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, DkkDenmarkActivity.class);
                startActivity(intent);
            }
        });
        iskCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, IskIcelandActivity.class);
                startActivity(intent);
            }
        });
        nokCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, NokNorwayActivity.class);
                startActivity(intent);
            }
        });
        sekCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, SekSwedenActivity.class);
                startActivity(intent);
            }
        });
        hrkCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, HrkCroatiaActivity.class);
                startActivity(intent);
            }
        });
        ronCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, RonRomaniaActivity.class);
                startActivity(intent);
            }
        });
        bgnCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, BgnBulgariaActivity.class);
                startActivity(intent);
            }
        });
        tryCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, TryTurkeyActivity.class);
                startActivity(intent);
            }
        });/*
        ilsCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        clpCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        phpCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        mxnCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        zarCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        brlCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        myrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });*/
        rubCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, RubRussiaActivity.class);
                startActivity(intent);
            }
        });/*
        idrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        inrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        krwCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        cnyCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        xdrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });*/
    }
}