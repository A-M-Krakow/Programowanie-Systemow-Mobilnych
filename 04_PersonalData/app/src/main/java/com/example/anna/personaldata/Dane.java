package com.example.anna.personaldata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Dane extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dane);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String imie = extras.getString("EXTRA_IMIE");
        String nazwisko = extras.getString("EXTRA_NAZWISKO");
        String plec = extras.getString("EXTRA_PLEC");
        String adres = extras.getString("EXTRA_ADRES");
        String kod = extras.getString("EXTRA_KOD");
        String miasto = extras.getString("EXTRA_MIASTO");

        TextView imieTextView = (TextView) findViewById(R.id.imieTextView);
        TextView nazwiskoTextView = (TextView) findViewById(R.id.nazwiskoTextView);
        TextView plecTextView = (TextView) findViewById(R.id.plecTextView);
        TextView adresTextView = (TextView) findViewById(R.id.adresTextView);
        TextView kodTextView = (TextView) findViewById(R.id.kodTextView);
        TextView miastoTextView = (TextView) findViewById(R.id.miastoTextView);



        imieTextView.setText(imie);
        nazwiskoTextView.setText(nazwisko);
        plecTextView.setText(plec);
        adresTextView.setText(adres);
        kodTextView.setText(kod);
        miastoTextView.setText(miasto);

    }
}
