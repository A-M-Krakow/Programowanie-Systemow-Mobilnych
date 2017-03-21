package com.example.anna.aktywnosci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Powitanie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_powitanie);

        Intent intencja = getIntent();
        Bundle extras = intencja.getExtras();
        String imie = extras.getString("EXTRAS_IMIE");
        String adres = extras.getString("EXTRAS_ADRES");
        String kod = extras.getString("EXTRAS_KOD");
        String miasto = extras.getString("EXTRAS_MIASTO");

        TextView imieTextView = (TextView) findViewById(R.id.imieTextView);
        TextView adresTextView = (TextView) findViewById(R.id.adresTextView);
        TextView kodTextView = (TextView) findViewById(R.id.kodTextView);
        TextView miastoTextView = (TextView) findViewById(R.id.miastoTextView);

        imieTextView.setText(getString(R.string.witaj) + ", " + imie);
        adresTextView.setText(adres);
        kodTextView.setText(kod);
        miastoTextView.setText(miasto);

    }
}
