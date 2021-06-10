package com.example.proje_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class randevu_al extends AppCompatActivity {
    TextView tv1, tv2, tv3, tv4;
    private String[] polikinlik = {"Dahiliye", "Ağız Ve Diş Sağlığı", "Noroloji", "Kardiyoloji"};
    private String[] polikinlikd = {"DR.Ahmet", "DR.Selim", "DR.Burak"};
    private String[] polikinlikd1 = {"DR.Yusuf", "DR.Ömer", "DR.yunus"};
    private String[] polikinlikd2 = {"DR.Emre", "DR.Emrah", "DR.Bekir"};
    private String[] polikinlikd3 = {"DR.Ekrem", "DR.Hamdi", "DR.Erdem"};
    private String[] saat = {"10.00", "10.30", "11.00", "11.30", "12.00", "12.30", "13.00", "13.30", "14.00", "14.30", "15.00", "15.30", "16.00", "16.30", "17.00"};

    private Spinner spinnerpolikinlik;
    private Spinner spinnerdoktor;
    private Spinner spinnersaat;
    private ArrayAdapter<String> dataAdapterForpolikinlik;
    private ArrayAdapter<String> dataAdapterFordoktor;
    private ArrayAdapter<String> dataAdaptersaat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randevu_al);

        tv1 = (TextView)findViewById(R.id.baslikrandevual);
        tv2 = (TextView)findViewById(R.id.tvp);
        tv3 = (TextView)findViewById(R.id.tvd);
        tv4 = (TextView)findViewById(R.id.tvr);


        spinnerpolikinlik = (Spinner) findViewById(R.id.spinner);
        spinnerdoktor = (Spinner) findViewById(R.id.spinner2);
        spinnersaat = (Spinner)findViewById(R.id.spinner3);


        dataAdapterForpolikinlik = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, polikinlik);
        dataAdapterFordoktor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,polikinlikd);
        dataAdaptersaat = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,saat);


        dataAdapterForpolikinlik.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterFordoktor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdaptersaat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerpolikinlik.setAdapter(dataAdapterForpolikinlik);
        spinnerdoktor.setAdapter(dataAdapterFordoktor);
        spinnersaat.setAdapter(dataAdaptersaat);

        spinnerpolikinlik.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getSelectedItem().toString().equals(polikinlik[0]))
                    dataAdapterFordoktor = new ArrayAdapter<String>(randevu_al.this, android.R.layout.simple_spinner_item,polikinlikd);
                else if(parent.getSelectedItem().toString().equals(polikinlik[1]))
                    dataAdapterFordoktor = new ArrayAdapter<String>(randevu_al.this, android.R.layout.simple_spinner_item,polikinlikd1);
                else if(parent.getSelectedItem().toString().equals(polikinlik[2]))
                    dataAdapterFordoktor = new ArrayAdapter<String>(randevu_al.this, android.R.layout.simple_spinner_item,polikinlikd2);
                else if(parent.getSelectedItem().toString().equals(polikinlik[3]))
                    dataAdapterFordoktor = new ArrayAdapter<String>(randevu_al.this, android.R.layout.simple_spinner_item,polikinlikd3);

                dataAdapterForpolikinlik.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerdoktor.setAdapter(dataAdapterFordoktor);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerdoktor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), ""+spinnerpolikinlik.getSelectedItem().toString()+"n"+parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnersaat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        final Button btnrandevu = findViewById(R.id.btnrandevu);
        btnrandevu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference().child("randevu");
                dbRef.push().setValue(new randevu(
                        spinnerpolikinlik.getSelectedItem().toString(),
                        spinnerdoktor.getSelectedItem().toString(),
                        spinnersaat.getSelectedItem().toString())
                );

                Intent intent = new Intent(getApplicationContext(),randevularim.class);
                startActivity(intent);
                Toast.makeText (getApplicationContext (), "Randevunuz alınmıştır." , Toast.LENGTH_SHORT) .show ();

            }
        });



    }
}
