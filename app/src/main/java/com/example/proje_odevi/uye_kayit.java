package com.example.proje_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class uye_kayit extends AppCompatActivity {
    private String[] cinsiyet = {"KADIN","ERKEK"};
    Button kaydoluye;
    veriTabani v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_kayit);

        v1 = new veriTabani(this);


        final TextView tv1 = (TextView)findViewById(R.id.baslik);
        final EditText et1 = (EditText)findViewById(R.id.isimedt);
        final EditText et2 = (EditText)findViewById(R.id.sysedt);
        final EditText et3 = (EditText)findViewById(R.id.tcedt);
        final EditText et4 = (EditText)findViewById(R.id.dgtedt);
        final EditText et5 = (EditText)findViewById(R.id.cnsytedt);
        final EditText et6 = (EditText)findViewById(R.id.sifreedt);
        final EditText et7 = (EditText)findViewById(R.id.sifretedt);


        kaydoluye = findViewById(R.id.kaydoluye);
        kaydoluye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = v1.getWritableDatabase();
                ContentValues veriler = new ContentValues();
                veriler.put("isim", et1.getText().toString());
                veriler.put("soyisim", et2.getText().toString());
                veriler.put("dogumTarihi", et3.getText().toString());
                veriler.put("cinsiyet", et4.getText().toString());
                veriler.put("sifre", et5.getText().toString());
                veriler.put("sifreTekrar", et6.getText().toString());
                db.insert("hastaBilgi",null, veriler);


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                Toast.makeText (getApplicationContext (), "Kayıt işleminiz gerçekleşmiştir." , Toast.LENGTH_SHORT) .show ();



            }
        });




    }

}
