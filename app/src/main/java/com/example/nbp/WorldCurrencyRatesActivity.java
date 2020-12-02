package com.example.nbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nbp.Currencies.AudAustraliaActivity;
import com.example.nbp.Currencies.CadCanadaActivity;
import com.example.nbp.Currencies.HkdHongkongActivity;
import com.example.nbp.Currencies.ThbThailandActivity;
import com.example.nbp.Currencies.UsdAmericaActivity;

public class WorldCurrencyRatesActivity extends AppCompatActivity {
    
    CardView thbCurrButton, usdCurrButton, audCurrButton, hkdCurrButton, cadCurrButton, ndzCurrButton, sgdCurrButton, jpyCurrButton, ilsCurrButton,
            clpCurrButton, phpCurrButton, mxnCurrButton, zarCurrButton, brlCurrButton, myrCurrButton, idrCurrButton, inrCurrButton, krwCurrButton,
            cnyCurrButton, xdrCurrButton, afnCurrButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_currency_rates);

        thbCurrButton = findViewById(R.id.thbCurrency);
        usdCurrButton = findViewById(R.id.usdCurrency);
        audCurrButton = findViewById(R.id.audCurrency);
        hkdCurrButton = findViewById(R.id.hkdCurrency);
        cadCurrButton = findViewById(R.id.cadCurrency);
        //ndzCurrButton = findViewById(R.id.ndzCurrency);
        //sgdCurrButton = findViewById(R.id.sgdCurrency);
        //jpyCurrButton = findViewById(R.id.);*/
                /*
        ilsCurrButton = findViewById(R.id.);
        clpCurrButton = findViewById(R.id.);
        phpCurrButton = findViewById(R.id.);
        mxnCurrButton = findViewById(R.id.);
        zarCurrButton = findViewById(R.id.);
        brlCurrButton = findViewById(R.id.);
        myrCurrButton = findViewById(R.id.);
        */
                /*
        afnCurrButton = findViewById(R.id.);
        idrCurrButton = findViewById(R.id.);
        inrCurrButton = findViewById(R.id.);
        krwCurrButton = findViewById(R.id.);
        cnyCurrButton = findViewById(R.id.);
        xdrCurrButton = findViewById(R.id.);*/

              /*
        afnCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, AfnAfghanistanActivity.class);
                startActivity(intent);
            }
        });    */

        thbCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, ThbThailandActivity.class);
                startActivity(intent);
            }
        });
        usdCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, UsdAmericaActivity.class);
                startActivity(intent);
            }
        });
        audCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, AudAustraliaActivity.class);
                startActivity(intent);
            }
        });
        hkdCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, HkdHongkongActivity.class);
                startActivity(intent);
            }
        });
        cadCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, CadCanadaActivity.class);
                startActivity(intent);
            }
        });/*
        ndzCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, NzdNewZelandActivity.class);
                startActivity(intent);
            }
        });
        sgdCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, SgdSingaporeActivity.class);
                startActivity(intent);
            }
        });*/
        /*
        jpyCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });*/
        /*
        idrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        inrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        krwCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        cnyCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        xdrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });*/
        /*
        ilsCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        clpCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        phpCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        mxnCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        zarCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        brlCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });
        myrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, .class);
                startActivity(intent);
            }
        });*/
    }
}