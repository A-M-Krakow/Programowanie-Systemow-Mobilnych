package com.example.anna.a01_logi_aktywnosci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST", "Została wywołana metoda onCreate()");
    }

    protected void onStart() {
        super.onStart();
        Log.d("TEST", "Została wywołana metoda onStart()");
    }

    protected void onResume() {
        super.onResume();
        Log.d("TEST", "Została wywołana metoda onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.d("TEST", "Została wywołana metoda onPause()");
    }

    protected void onStop() {
        super.onStop();
        Log.d("TEST", "Została wywołana metoda onStop()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("TEST", "Została wywołana metoda onRestart()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("TEST", "Została wywołana metoda onDestroy()");
    }


}
