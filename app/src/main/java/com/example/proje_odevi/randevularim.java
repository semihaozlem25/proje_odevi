package com.example.proje_odevi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.proje_odevi.R.*;
import static com.example.proje_odevi.R.id.baslik;
import static com.example.proje_odevi.R.id.baslikgiris;
import static com.example.proje_odevi.R.id.randevu;

public class randevularim extends AppCompatActivity {
    ListView listView;
    String[] randevu = {"Dahiliye-DR.Ahmet-10.30","Ağız Ve Diş Sağlığı-DR.Ömer-13.00","Noroloji-DR.Emre-16.00","Kardiyoloji-DR.Hamdi-12.30"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_randevularim);

        listView = (ListView)findViewById(R.id.ltv1);
        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, randevu);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(getApplicationContext(),randevu[position], Toast.LENGTH_LONG).show();


            }
        });


        final TextView tv1 = (TextView)findViewById(baslik);

        final AlertDialog.Builder builder = new AlertDialog.Builder(randevularim.this);
        LayoutInflater inflater = LayoutInflater.from(randevularim.this);

        @SuppressLint("ResourceType") final View custom_dialog = LayoutInflater.from(getApplicationContext())
                .inflate(layout.layout_dialog, (LinearLayout)findViewById(layout.layout_dialog));


        final Button btncikis = findViewById(id.btncikis);
        btncikis.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               builder.setView(custom_dialog);
               builder.show();


           }
       });
        custom_dialog.findViewById(id.btnevet).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(getApplicationContext(),giris.class);
               startActivity(intent);

           }
       });
       custom_dialog.findViewById(id.btnhayir).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(),randevularim.class);
               startActivity(intent);
               Toast.makeText(randevularim.this, "İşleminiz devam etmektedir.", Toast.LENGTH_SHORT).show();

           }
       });





    }
}
