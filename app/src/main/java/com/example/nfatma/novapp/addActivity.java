package com.example.nfatma.novapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.icu.text.UnicodeSetSpanner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class addActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText ed1, ed2, ed3;
    private Button add;
    private SQLiteDatabase db;

    String tableName = "student";
    String id = "stud_id";
    String first_name = "First_Name";
    String last_name = "Last_Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        ed1 = findViewById(R.id.id);
        ed2 = findViewById(R.id.first);
        ed3 = findViewById(R.id.sec);
        add = findViewById(R.id.add);

            db = openOrCreateDatabase("student",MODE_PRIVATE,null);

            String q = String.format("CREATE TABLE IF NOT EXISTS %s(%s INTEGER, %s TEXT, %s TEXT )", tableName, id, first_name, last_name);

            db.execSQL(q);

        add.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == add){

            String a = ed1.getText().toString();
            String b = ed2.getText().toString();
            String c = ed3.getText().toString();

            String q = "insert into student values('"+parseInt(a)+"','"+b+"','"+c+"')";
            db.execSQL(q);

            Toast t = Toast.makeText(this, "ROW ADDED", Toast.LENGTH_LONG);
            t.show();
        }
    }
}
