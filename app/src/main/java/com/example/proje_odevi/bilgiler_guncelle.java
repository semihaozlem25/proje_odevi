package com.example.proje_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bilgiler_guncelle extends AppCompatActivity {
    Button guncelle;
    TextView tv1;
    EditText ad, soyad, tc, dgrt, cnsyt, sifre, sifret;
    veriTabani v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgiler_guncelle);

        v1 = new veriTabani(this);

        tv1 = (TextView)findViewById(R.id.baslik);
        ad = (EditText)findViewById(R.id.adedt);
        soyad = (EditText)findViewById(R.id.soyadedt);
        tc = (EditText)findViewById(R.id.tckedt);
        dgrt = (EditText)findViewById(R.id.dgtredt);
        cnsyt = (EditText)findViewById(R.id.cnsytedt);
        sifre = (EditText)findViewById(R.id.sfredt);
        sifret = (EditText)findViewById(R.id.sfrttedt);

        guncelle = findViewById(R.id.btnguncelle);
        guncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = v1.getWritableDatabase();
                ContentValues cv = new ContentValues();


            }
        });

    }
}
