package com.example.proje_odevi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.altitem){
            Toast.makeText(this, "Dil değiştirildi.", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final  EditText et1=(EditText)findViewById(R.id.edittc);
        final EditText et2= (EditText)findViewById(R.id.edittc);
        final TextView tv = (TextView)findViewById(R.id.kayıt);


        final Button btnkaydol = findViewById(R.id.button);
        btnkaydol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),uye_kayit.class);
                startActivity(intent);
            }
        });

        final Button btngiris = findViewById(R.id.button2);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(et1.getText().toString().equals("12345678901") && et2.getText().toString().equals("123456")){
                    Intent i = new Intent(getApplicationContext(), giris.class);
                    i.putExtra("id", et1.getText().toString());
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"TC kimlik numarası veya şifre yanlış",Toast.LENGTH_SHORT).show();
                }
                if(et1.getText().toString().equals("2525252525") && et2.getText().toString().equals("2525")){
                    Intent i = new Intent(getApplicationContext(), hasta_liste.class);
                    i.putExtra("id", et1.getText().toString());
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"TC kimlik numarası veya şifre yanlış",Toast.LENGTH_SHORT).show();
                }

            }
        });






    }
}
