package com.example.proje_odevi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class veriTabani extends SQLiteOpenHelper {
    public veriTabani( Context context) {

        super(context, "Hastalar", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE hastaBilgi (id INTEGER PRIMARY KEY AUTOINCREMENT, isim TEXT, soyisim TEXT,tcKimlik İNT, dogumTarihi VARCHAR, cinsiyet TEXT, sifre TEXT, sifreTekrar TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS hastaBilgi");
        onCreate(db);

    }
}
