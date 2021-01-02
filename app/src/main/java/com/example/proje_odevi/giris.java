package com.example.proje_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.proje_odevi.R.id.baslikgiris;

public class giris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        final TextView tv1 = (TextView)findViewById(baslikgiris);

        findViewById(R.id.randevu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),randevularim.class);
                startActivity(intent);


            }
        });
        findViewById(R.id.randevual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),randevu_al.class);
                startActivity(intent);



            }
        });



    }
}
