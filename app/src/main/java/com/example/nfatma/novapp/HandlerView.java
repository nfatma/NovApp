package com.example.nfatma.novapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class HandlerView extends AppCompatActivity implements View.OnClickListener {

    private EditText ed;
    private TextView tv;
    private Button ok;
    private DbHelper help;
    private SQLiteDatabase db;
    private String  d = "";
    private  int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_view);

        ed = findViewById(R.id.ed);
        tv = findViewById(R.id.display);
        ok = findViewById(R.id.submit);

        help = new DbHelper(this, null,null, 1);

        db = openOrCreateDatabase(help.database_name,MODE_PRIVATE,null);

        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == ok){
            id = parseInt(ed.getText().toString());
            Cursor cursor = help.view(db, id);

            Log.i("aba",cursor.toString());

//            if (cursor. != null){
//                Toast t = Toast.makeText(this, "null", Toast.LENGTH_SHORT);
//                t.show();
//
//            }

            while(cursor.moveToNext()){
                String a = cursor.getString(1);
                String b = cursor.getString(2);
                int c = cursor.getInt(3);

                Toast t = Toast.makeText(this, "hey", Toast.LENGTH_SHORT);
                t.show();

                d = d + "\n" + a + " " + b + " " + Integer.toString(c);
            }
            tv.setText(d);
        }
    }
}
