package com.example.u4formulariologin1302;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botonRegistro (View view){
        Intent i = new Intent (getApplicationContext(),FormularioActivity.class);
        startActivity(i);
    }

    public void botonEntrar (View view){
        Intent i = new Intent (getApplicationContext(),LoginActivity.class);
        startActivity(i);
    }



}
