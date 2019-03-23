package com.example.nfatma.novapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class viewActivity extends AppCompatActivity {

    private TextView tv;
    private SQLiteDatabase db;
    String d = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tv = findViewById(R.id.ViewDb);

        db=openOrCreateDatabase("student",MODE_PRIVATE,null);
        String q = "SELECT * FROM student";
        Cursor cursor = db.rawQuery(q, null);
        while(cursor.moveToNext()){
            String a = cursor.getString(0);
            String b = cursor.getString(1);
            String c = cursor.getString(2);

            d = d + "\n" + a + " " + b + " " + c;
        }

        tv.setText(d);
    }
}
