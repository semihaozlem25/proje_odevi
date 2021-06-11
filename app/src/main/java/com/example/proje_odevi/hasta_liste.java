package com.example.proje_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class hasta_liste extends AppCompatActivity {
    Button goster, sil;
    TextView tv;
    veriTabani v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasta_liste);

        tv = (TextView)findViewById(R.id.hasta_list);
        goster = findViewById(R.id.btngoster);
        sil = findViewById(R.id.btnsil);

    }
}
