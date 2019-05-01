package com.daff.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentExplicit extends AppCompatActivity {

    final static String KEY_NAME = "name";
    final static String KEY_DATE= "date";

    //deklarasi
    EditText nama, tanggal;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit);

        //inisialisasi

        nama = findViewById(R.id.nama);
        tanggal = findViewById(R.id.tanggal);
        btnShow = findViewById(R.id.show);


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //simpan data dari edit text kedalam variable
                String name = nama.getText().toString();
                String date = tanggal.getText().toString();

                //pindah activity dengan membawa data ke TampilData Activity
                Intent moveWithData = new Intent(IntentExplicit.this, TampilData.class);

                //mengirim data menggunakan methode putExtra()
                //putExtra memilki 2 parameter ==> 1.kunci nya 2.data yang mau kita kirim
                moveWithData.putExtra(KEY_NAME, name);
                moveWithData.putExtra(KEY_DATE, date);
                startActivity(moveWithData);
            }
        });
    }
}
