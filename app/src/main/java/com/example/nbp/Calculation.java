package com.example.nbp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.nbp.JSON.JsonParseSingleCurrency;

import java.util.ArrayList;

public class Calculation extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] country1 = {"EUR","HUF","CHF","GBP","UAH","CZK","DKK","ISK","NOK","SEK","HRK","RON","BGN","TRY","RUB"};
    String[] country2 = {"EUR","HUF","CHF","GBP","UAH","CZK","DKK","ISK","NOK","SEK","HRK","RON","BGN","TRY","RUB"};
    private TextView mTextViewResult1, mTextViewResult2;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        Spinner spin1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        spin1.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);

        mTextViewResult1 = findViewById(R.id.currValue1);
        mTextViewResult2 = findViewById(R.id.currValue2);
        requestQueue = Volley.newRequestQueue(this);

        ArrayAdapter aa1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country1);
        ArrayAdapter aa2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country2);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa1);
        spin2.setAdapter(aa2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinner1) {
            JsonParseSingleCurrency.jsonParsingSpinner(country1[position],this,requestQueue,mTextViewResult1);
        }
        else if (parent.getId() == R.id.spinner2) {
            JsonParseSingleCurrency.jsonParsingSpinner(country2[position],this,requestQueue,mTextViewResult2);
        }
        else {
            System.out.println("Something went wrong!");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}