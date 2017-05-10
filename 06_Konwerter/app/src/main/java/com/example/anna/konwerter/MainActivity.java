package com.example.anna.konwerter;

import android.icu.math.BigDecimal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final static Double KURS = 4.27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }


    public void przelicz(View view) {
        TextView EURTextView = (TextView) findViewById(R.id.EURTextView);
        EditText PLNEditText = (EditText) findViewById(R.id.PLNEditText);
        String PLN = PLNEditText.getText().toString();

        Double EURDOuble = (new Double(PLN)) / KURS;

        String EUR = EURDOuble.toString();

        EURTextView.setText(EUR + " EUR = " + PLN + " PLN");
    }

}

