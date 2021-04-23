package com.example.proje_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class uye_kayit extends AppCompatActivity {
    private String[] cinsiyet = {"KADIN","ERKEK"};
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7;
    EditText et1, et2, et3, et4, et5, et6;
    Button kaydoluye;
    Spinner spinnercinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_kayit);
        tv1 = (TextView)findViewById(R.id.baslik);
        tv2 = (TextView)findViewById(R.id.isim);
        tv3 = (TextView)findViewById(R.id.sysisim);
        tv4 = (TextView)findViewById(R.id.dtrh);
        tv5 = (TextView)findViewById(R.id.cnsyt);
        tv6 = (TextView)findViewById(R.id.sifre);
        tv7 = (TextView)findViewById(R.id.sifret);
        et1 = (EditText)findViewById(R.id.isimedt);
        et2 = (EditText)findViewById(R.id.sysedt);
        et3 = (EditText)findViewById(R.id.dgtedt);
        et4 = (EditText)findViewById(R.id.cnsytedt);
        et5 = (EditText)findViewById(R.id.sifreedt);
        et6 = (EditText)findViewById(R.id.sifretedt);
        kaydoluye = findViewById(R.id.kaydoluye);



        kaydoluye.setBackgroundColor(Color.parseColor("#ff0006"));
        kaydoluye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference().child("users");
                dbRef.push().setValue(new User(
                        et1.getText().toString(),
                        et2.getText().toString(),
                        et3.getText().toString(),
                        et4.getText().toString(),
                        et5.getText().toString(),
                        et6.getText().toString())
                );
                finish();


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
