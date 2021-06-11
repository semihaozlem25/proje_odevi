package com.example.proje_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class uye_kayit extends AppCompatActivity {
    Button kaydoluye;
    TextView tv1;
    EditText ad, soyad, tc, dgrt, cnsyt, sifre, sifret;
    veriTabani v1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_kayit);

        v1 = new veriTabani(this);


        tv1 = (TextView)findViewById(R.id.baslik);
        ad = (EditText)findViewById(R.id.isimedt);
        soyad = (EditText)findViewById(R.id.sysedt);
        tc = (EditText)findViewById(R.id.tckedt);
        dgrt = (EditText)findViewById(R.id.dgtredt);
        cnsyt = (EditText)findViewById(R.id.cnsytedt);
        sifre = (EditText)findViewById(R.id.sifreedt);
        sifret = (EditText)findViewById(R.id.sifretedt);




        kaydoluye = findViewById(R.id.kaydoluye);
        kaydoluye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try
                {
                    kayıtEkle(ad.getText().toString(),soyad.getText().toString(),tc.getText().toString(),dgrt.getText().toString(),cnsyt.getText().toString(), sifre.getText().toString(), sifret.getText().toString());
                }
                finally
                {
                    v1.close();
                }

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                Toast.makeText (getApplicationContext (), "Kayıt işleminiz gerçekleşmiştir." , Toast.LENGTH_SHORT) .show ();

            }
        });


    }
    private void kayıtEkle(String adi, String soyadi, String Tc, String dogumtrh, String cinsiyet, String sifre, String sifret )
    {
        SQLiteDatabase db = v1.getWritableDatabase();
        ContentValues veriler = new ContentValues();
        veriler.put("isim", adi);
        veriler.put("soyisim", soyadi);
        veriler.put("tckimlikNo", Tc);
        veriler.put("dogumTarihi", dogumtrh);
        veriler.put("cinsiyet", cinsiyet);
        veriler.put("sifre", sifre);
        veriler.put("sifreTekrar", sifret);
        db.insert("hastaBilgi",null, veriler);

    }

}
