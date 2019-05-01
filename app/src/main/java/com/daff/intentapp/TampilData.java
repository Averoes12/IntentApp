package com.daff.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.daff.intentapp.IntentExplicit.KEY_DATE;
import static com.daff.intentapp.IntentExplicit.KEY_NAME;

public class TampilData extends AppCompatActivity {
    //deklarasi

    TextView nama, tanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);
        //inisialisi
        nama = findViewById(R.id.namaData);
        tanggal = findViewById(R.id.tanggalData);

        //menerima data dari activity yang mengirim data

        Intent terimaData = getIntent();
        String name = terimaData.getStringExtra(KEY_NAME);
        String date = terimaData.getStringExtra(KEY_DATE);
        nama.setText(String.valueOf(name));
        tanggal.setText(String.valueOf(date));

    }
}
