package com.example.nbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
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

public class EurCurrencyRatesActivity extends AppCompatActivity {

    CardView eurCurrButton, hufCurrButton, chfCurrButton, rubCurrButton,
    gbpCurrButton, uahCurrButton, czkCurrButton, dkkCurrButton, iskCurrButton, nokCurrButton, sekCurrButton, hrkCurrButton, ronCurrButton, bgnCurrButton, tryCurrButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eur_currency_rates);

        eurCurrButton = findViewById(R.id.eurCurrency);
        hufCurrButton = findViewById(R.id.hufCurrency);
        chfCurrButton = findViewById(R.id.chfCurrency);
        gbpCurrButton = findViewById(R.id.gbpCurrency);
        uahCurrButton = findViewById(R.id.uahCurrency);
        czkCurrButton = findViewById(R.id.czkCurrency);
        dkkCurrButton = findViewById(R.id.dkkCurrency);
        iskCurrButton = findViewById(R.id.iskCurrency);
        nokCurrButton = findViewById(R.id.nokCurrency);
        sekCurrButton = findViewById(R.id.sekCurrency);
        hrkCurrButton = findViewById(R.id.hrkCurrency);
        ronCurrButton = findViewById(R.id.ronCurrency);
        bgnCurrButton = findViewById(R.id.bgnCurrency);
        tryCurrButton = findViewById(R.id.tryCurrency);
        rubCurrButton = findViewById(R.id.rubCurrency);

        eurCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, EurEuropeActivity.class);
            startActivity(intent);
        });
        hufCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, HufHungaryActivity.class);
            startActivity(intent);
        });
        chfCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, ChfSwitzerlandActivity.class);
            startActivity(intent);
        });
        gbpCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, GbpGreatBritainActivity.class);
            startActivity(intent);
        });

        uahCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, UahUkraineActivity.class);
            startActivity(intent);
        });
        czkCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, CzkCechRepublicActivity.class);
            startActivity(intent);
        });
        dkkCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, DkkDenmarkActivity.class);
            startActivity(intent);
        });
        iskCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, IskIcelandActivity.class);
            startActivity(intent);
        });
        nokCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, NokNorwayActivity.class);
            startActivity(intent);
        });
        sekCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, SekSwedenActivity.class);
            startActivity(intent);
        });
        hrkCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, HrkCroatiaActivity.class);
            startActivity(intent);
        });
        ronCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, RonRomaniaActivity.class);
            startActivity(intent);
        });
        bgnCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, BgnBulgariaActivity.class);
            startActivity(intent);
        });
        tryCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, TryTurkeyActivity.class);
            startActivity(intent);
        });
        rubCurrButton.setOnClickListener(view -> {
            Intent intent = new Intent(EurCurrencyRatesActivity.this, RubRussiaActivity.class);
            startActivity(intent);
        });
    }
}