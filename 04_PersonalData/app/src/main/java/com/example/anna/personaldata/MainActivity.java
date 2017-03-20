package com.example.anna.personaldata;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    public void showDialog(View view) {

        EditText imieTextView = (EditText) findViewById(R.id.imieTextView);
        String imie = imieTextView.getText().toString();

        AlertDialog alertDialog =   new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle(getResources().getString(R.string.dialogTitle));
        String message = imie + ",  " + getResources().getString(R.string.dialogText);
        alertDialog.setMessage(message);
        alertDialog.show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = (Spinner) findViewById(R.id.plec);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.plec, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



    }
}
