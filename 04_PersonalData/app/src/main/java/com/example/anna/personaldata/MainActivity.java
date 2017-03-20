package com.example.anna.personaldata;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    public void wyslijDane(View view) {
        Intent wysylanieDanych = new Intent(this, Dane.class);
        EditText imieEditText = (EditText) findViewById(R.id.imieEditText);
        EditText nazwiskoEditText = (EditText) findViewById(R.id.nazwiskoEditText);
        Spinner plecSpinner = (Spinner) findViewById(R.id.plecSpinner);
        EditText adresEditText = (EditText) findViewById(R.id.adresEditText);
        EditText kodEditText = (EditText) findViewById(R.id.kodEditText);
        EditText miastoEditText = (EditText) findViewById(R.id.miastoEditText);

        String imie = imieEditText.getText().toString();
        String nazwisko = nazwiskoEditText.getText().toString();
        String plec = plecSpinner.getSelectedItem().toString();
        String adres = adresEditText.getText().toString();
        String kod = kodEditText.getText().toString();
        String miasto = miastoEditText.getText().toString();

        Intent intencja = getIntent();
        Bundle extras = new Bundle();
        extras.putString("EXTRA_IMIE",imie);
        extras.putString("EXTRA_NAZWISKO",nazwisko);
        extras.putString("EXTRA_PLEC",plec);
        extras.putString("EXTRA_ADRES",adres);
        extras.putString("EXTRA_KOD",kod);
        extras.putString("EXTRA_MIASTO",miasto);

        wysylanieDanych.putExtras(extras);
        startActivity(wysylanieDanych);
    }



    public void showDialog(View view) {

        EditText imieEditText = (EditText) findViewById(R.id.imieEditText);
        EditText nazwiskoEditText = (EditText) findViewById(R.id.nazwiskoEditText);
        Spinner plecSpinner = (Spinner) findViewById(R.id.plecSpinner);
        EditText adresEditText = (EditText) findViewById(R.id.adresEditText);
        EditText kodEditText = (EditText) findViewById(R.id.kodEditText);
        EditText miastoEditText = (EditText) findViewById(R.id.miastoEditText);


        String imie = imieEditText.getText().toString();
        String nazwisko = nazwiskoEditText.getText().toString();
        String plec = plecSpinner.getSelectedItem().toString();
        String adres = adresEditText.getText().toString();
        String kod = kodEditText.getText().toString();
        String miasto = miastoEditText.getText().toString();


        AlertDialog alertDialog =   new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle(getResources().getString(R.string.dialogTitle));
        String message = imie + "\n" + nazwisko + "\n" + plec + "\n" + adres + "\n" + kod + " " + miasto + "\n" + getResources().getString(R.string.dialogText);
        alertDialog.setMessage(message);
        alertDialog.show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner plecSpinner = (Spinner) findViewById(R.id.plecSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.plec, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        plecSpinner.setAdapter(adapter);



    }
}
