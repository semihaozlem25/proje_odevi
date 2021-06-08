package com.example.proje_odevi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class veriTabani extends SQLiteOpenHelper {
    public veriTabani( Context context) {

        super(context, "veriTabaniAdi", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table hastaBilgi (id INTEGER PRIMARY KEY AUTOINCREMENT, isim Text, soyisim Text, " +
                "dogumTarihi Text, cinsiyet Text, sifre Text, sifreTekrar Text);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS hastaBilgi");
        onCreate(db);

    }
}
