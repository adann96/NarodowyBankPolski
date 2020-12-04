package com.example.nbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nbp.Currencies.AfnAfghanistanActivity;
import com.example.nbp.Currencies.AudAustraliaActivity;
import com.example.nbp.Currencies.BrlBrazilActivity;
import com.example.nbp.Currencies.CadCanadaActivity;
import com.example.nbp.Currencies.ClpChileActivity;
import com.example.nbp.Currencies.CnyChinaActivity;
import com.example.nbp.Currencies.HkdHongkongActivity;
import com.example.nbp.Currencies.IdrIndonesiaActivity;
import com.example.nbp.Currencies.InrIndiaActivity;
import com.example.nbp.Currencies.IslIsraelActivity;
import com.example.nbp.Currencies.JpyJapanActivity;
import com.example.nbp.Currencies.KrwSouthKoreaActivity;
import com.example.nbp.Currencies.MxnMexicoActivity;
import com.example.nbp.Currencies.MyrMalesiaActivity;
import com.example.nbp.Currencies.NzdNewZelandActivity;
import com.example.nbp.Currencies.PhpPhilipinesActivity;
import com.example.nbp.Currencies.SgdSingaporeActivity;
import com.example.nbp.Currencies.ThbThailandActivity;
import com.example.nbp.Currencies.UsdAmericaActivity;
import com.example.nbp.Currencies.XdrSpecialDrawingRights;
import com.example.nbp.Currencies.ZarRsaActivity;

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
        ndzCurrButton = findViewById(R.id.nzdCurrency);
        sgdCurrButton = findViewById(R.id.sgdCurrency);
        jpyCurrButton = findViewById(R.id.jpyCurrency);
        ilsCurrButton = findViewById(R.id.ilsCurrency);
        clpCurrButton = findViewById(R.id.clpCurrency);
        phpCurrButton = findViewById(R.id.phpCurrency);
        mxnCurrButton = findViewById(R.id.mxnCurrency);
        zarCurrButton = findViewById(R.id.zarCurrency);
        brlCurrButton = findViewById(R.id.brlCurrency);
        myrCurrButton = findViewById(R.id.myrCurrency);
        afnCurrButton = findViewById(R.id.afnCurrency);
        idrCurrButton = findViewById(R.id.idrCurrency);
        inrCurrButton = findViewById(R.id.inrCurrency);
        krwCurrButton = findViewById(R.id.krwCurrency);
        cnyCurrButton = findViewById(R.id.cnyCurrency);
        xdrCurrButton = findViewById(R.id.sdrCurrency);


        afnCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, AfnAfghanistanActivity.class);
                startActivity(intent);
            }
        });
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
        });
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
        });
        jpyCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, JpyJapanActivity.class);
                startActivity(intent);
            }
        });
        idrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, IdrIndonesiaActivity.class);
                startActivity(intent);
            }
        });
        inrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, InrIndiaActivity.class);
                startActivity(intent);
            }
        });
        krwCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, KrwSouthKoreaActivity.class);
                startActivity(intent);
            }
        });
        cnyCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, CnyChinaActivity.class);
                startActivity(intent);
            }
        });
        xdrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, XdrSpecialDrawingRights.class);
                startActivity(intent);
            }
        });
        ilsCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, IslIsraelActivity.class);
                startActivity(intent);
            }
        });
        clpCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, ClpChileActivity.class);
                startActivity(intent);
            }
        });
        phpCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, PhpPhilipinesActivity.class);
                startActivity(intent);
            }
        });
        mxnCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, MxnMexicoActivity.class);
                startActivity(intent);
            }
        });
        zarCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, ZarRsaActivity.class);
                startActivity(intent);
            }
        });
        brlCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, BrlBrazilActivity.class);
                startActivity(intent);
            }
        });
        myrCurrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorldCurrencyRatesActivity.this, MyrMalesiaActivity.class);
                startActivity(intent);
            }
        });
    }
}