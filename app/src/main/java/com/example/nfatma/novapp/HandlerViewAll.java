package com.example.nfatma.novapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HandlerViewAll extends AppCompatActivity {

    private TextView tv;
    private DbHelper help;
    private SQLiteDatabase db;
    private String  d = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_view_all);

        tv = findViewById(R.id.view);

        db = openOrCreateDatabase(help.database_name,MODE_PRIVATE,null);

        help = new DbHelper(this, null,null, 1);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Cursor cursor = help.viewAll(db);

        while(cursor.moveToNext()){
            int id = cursor.getInt(0);
            String a = cursor.getString(1);
            String b = cursor.getString(2);
            int c = cursor.getInt(3);

//            Toast t = Toast.makeText(this, "hey", Toast.LENGTH_SHORT);
//            t.show();

            d = d + "\n" + Integer.toString(id) + " " + a + " " + b + " " + Integer.toString(c);
        }
        tv.setText(d);

    }
}
