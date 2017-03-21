package com.example.anna.aktywnosci;

import android.content.Intent;
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
        Intent pokazywanieInformacji = new Intent(this, informacje.class);
        startActivity(pokazywanieInformacji);

    }
}
