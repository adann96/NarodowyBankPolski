package com.example.nbp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.nbp.Currencies.AfnAfghanistanActivity;
import com.example.nbp.Currencies.EurEuropeActivity;
import com.example.nbp.JSON.JsonParseSingleCurrency;

import java.util.ArrayList;
import java.util.Comparator;

public class Calculation extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] country = {"EUR","HUF","CHF","GBP","UAH","CZK","DKK","ISK","NOK","SEK","HRK","RON","BGN","TRY","RUB"};
    String[] plnCurr = {"PLN"};
    private TextView mTextViewResult1, mTextViewResult2;
    private EditText editTextNumberDecimal;
    private RequestQueue requestQueue;
    TextView currCalcResult;
    private Button calcButton;

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
        currCalcResult = findViewById(R.id.currCalcResult);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        calcButton = findViewById(R.id.calcButton);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double currVal = Double.parseDouble(editTextNumberDecimal.getText().toString());

                if (currVal == 0) {
                    Toast.makeText(getApplicationContext(),"Wartość nie może być zerem!",Toast.LENGTH_LONG).show();
                }
                else if (currVal < 0) {
                    Toast.makeText(getApplicationContext(),"Wartość nie może być mniejsza od zera!",Toast.LENGTH_LONG).show();
                }
                else  {
                    double currCalc = currVal / Double.parseDouble(mTextViewResult2.getText().toString().substring(8));
                    currCalcResult.setText("");
                    currCalcResult.append(String.valueOf(currCalc));
                }
            }
        });

        requestQueue = Volley.newRequestQueue(this);

        ArrayAdapter aa1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,plnCurr);
        ArrayAdapter aa2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa1);
        spin2.setAdapter(aa2);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.spinner1) {
            mTextViewResult1.setText("1 PLN");
        }
        else if (parent.getId() == R.id.spinner2) {
            JsonParseSingleCurrency.jsonParsingSpinner(country[position],this,requestQueue,mTextViewResult2);
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