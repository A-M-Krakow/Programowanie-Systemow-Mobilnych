package com.example.anna.aktywnosci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pobieranie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pobieranie);
    }

    public void powitaj (View view)
    {
        Bundle extras = new Bundle();

        EditText imieEditText = (EditText) findViewById(R.id.imieEditText);
        String imie = imieEditText.getText().toString();
        extras.putString("EXTRAS_IMIE", imie);

        EditText adresEditText = (EditText) findViewById(R.id.adresEditText);
        String adres = adresEditText.getText().toString();
        extras.putString("EXTRAS_ADRES", adres);

        EditText kodEditText = (EditText) findViewById(R.id.kodEditText);
        String kod = kodEditText.getText().toString();
        extras.putString("EXTRAS_KOD", kod);

        EditText miastoEditText = (EditText) findViewById(R.id.miastoEditText);
        String miasto = miastoEditText.getText().toString();
        extras.putString("EXTRAS_MIASTO", miasto);

        EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
        String email = emailEditText.getText().toString();
        extras.putString("EXTRAS_EMAIL", email);


        Intent witanie = new Intent(this, Powitanie.class);
        witanie.putExtras(extras);
        startActivity(witanie);
    }
}
