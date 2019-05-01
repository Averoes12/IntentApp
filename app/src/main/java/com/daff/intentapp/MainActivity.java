package com.daff.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //todo 1 deklarasi view yang dibuat
    //pendeklarasian

    Button btn_intent,btn_intent_data, btn_intent_implicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 2 inisialisasi
        btn_intent = findViewById(R.id.btn_intent);

        btn_intent_data = findViewById(R.id.btn_intent_data);
        btn_intent_implicit = findViewById(R.id.btn_intent_implicit);

        //atur button ketika di click
        btn_intent.setOnClickListener(this);
        btn_intent_data.setOnClickListener(this);
        btn_intent_implicit.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_intent:
                //kasih alamat tujuan untuk perpindahan activity
                Intent move = new Intent(MainActivity.this , IntentActivity.class );
                //methode untuk perpindahan activity
                startActivity(move);
                break;

            case R.id.btn_intent_data:
                Intent movewithData = new Intent(MainActivity.this, IntentExplicit.class);
                startActivity(movewithData);
                break;

            case R.id.btn_intent_implicit:
                Intent intentImplicit = new Intent(MainActivity.this, IntentImplicit.class);
                startActivity(intentImplicit);
                break;
        }
    }
}
