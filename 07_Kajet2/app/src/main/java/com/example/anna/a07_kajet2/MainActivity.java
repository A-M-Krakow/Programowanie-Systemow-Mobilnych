package com.example.anna.a07_kajet2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean wyswietlanieOpisow;
    String rozmiarCzcionki;
    final int USTAWIENIA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.settings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_settings:
                Intent intencja = new Intent(this, PreferenceActivity.class);
                startActivityForResult(intencja, USTAWIENIA);
                break;
        }

        return true;
    }

    private void pokazAktualneUstawienia() {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        StringBuilder builder = new StringBuilder();
        builder.append("\n Wyświetlać opisy: " + sharedPrefs.getBoolean("pref_opis", true));
        builder.append("\n Rozmiar czcionki: " + sharedPrefs.getString("pref_fontsize", "Średni"));
        builder.append("\n Sortowanie: " + sharedPrefs.getString("pref_sorting", "asc"));
        builder.append("\n Hasło: " + sharedPrefs.getString("pref_pass", ""));
        TextView textView = (TextView) findViewById(R.id.textVIew);
        textView.setText(builder.toString());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case USTAWIENIA:
                pokazAktualneUstawienia();
                break;
        }
    }
}
