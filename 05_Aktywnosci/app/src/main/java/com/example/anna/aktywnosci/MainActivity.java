package com.example.anna.aktywnosci;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pokazInformacje (View view)
    {
        Intent pokazywanieInformacji = new Intent(this, Informacje.class);
        startActivity(pokazywanieInformacji);

    }

    public void pobierzDane (View view)
    {
        Intent pobieranieDanych = new Intent(this, Pobieranie.class);
        startActivity(pobieranieDanych);
    }

    public void zadzwon (View view)
    {
        Uri numer = Uri.parse("tel:123456789");
        Intent dzwonienie = new Intent(Intent.ACTION_DIAL, numer);
        startActivity(dzwonienie);
    }

    public void otworzStrone (View view)
    {
        Uri adresStrony = Uri.parse("http://www.m.onet.pl");
        Intent wyswietlanieStrony = new Intent(Intent.ACTION_VIEW, adresStrony);
        startActivity(wyswietlanieStrony);
    }
}
