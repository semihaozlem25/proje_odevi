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
        final TextView tv2 = (TextView)findViewById(R.id.isim);
        final TextView tv3 = (TextView)findViewById(R.id.sysisim);
        final TextView tv4 = (TextView)findViewById(R.id.dtrh);
        final TextView tv5 = (TextView)findViewById(R.id.cnsyt);
        final TextView tv6 = (TextView)findViewById(R.id.sifre);
        final TextView tv7 = (TextView)findViewById(R.id.sifret);
        final EditText et1 = (EditText)findViewById(R.id.isimedt);
        final EditText et2 = (EditText)findViewById(R.id.sysedt);
        final EditText et3 = (EditText)findViewById(R.id.dgtedt);
        final EditText et4 = (EditText)findViewById(R.id.cnsytedt);
        final EditText et5 = (EditText)findViewById(R.id.sifreedt);
        final EditText et6 = (EditText)findViewById(R.id.sifretedt);
        kaydoluye = findViewById(R.id.kaydoluye);



        kaydoluye.setBackgroundColor(Color.parseColor("#ff0006"));
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






                Intent intent = new Intent(getApplicationContext(), giris.class);
                startActivity(intent);

                Toast.makeText (getApplicationContext (), "Kayıt işleminiz gerçekleşmiştir." , Toast.LENGTH_SHORT) .show ();

                new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        kaydoluye.setBackgroundColor(Color.parseColor("#ffffff"));


                    }

                    @Override
                    public void onFinish() {
                        kaydoluye.setBackgroundColor(Color.parseColor("#ff0006"));


                    }
                }.start();

            }
        });




    }

}
