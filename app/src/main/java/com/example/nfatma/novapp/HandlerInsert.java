package com.example.nfatma.novapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class HandlerInsert extends AppCompatActivity implements View.OnClickListener {

    private EditText ed1, ed2, ed3, ed4;
    private Button add;
    private DbHelper help;
    private SQLiteDatabase db;
    private String  b, c ;
    private  int a, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_insert);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        add = findViewById(R.id.add);

        help = new DbHelper(this, null,null, 1);

        db = openOrCreateDatabase("Student_Data",MODE_PRIVATE,null);

        help.onCreate(db);

        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == add){

            String id = ed1.getText().toString();
            String marks = ed4.getText().toString();

            a = parseInt(id);
            b = ed2.getText().toString();
            c = ed3.getText().toString();
            d = parseInt(marks);

            help.insert(db, a, b, c ,d);
        }
    }
}
