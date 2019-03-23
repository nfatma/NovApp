package com.example.nfatma.novapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;


public class HandlerUpdate extends AppCompatActivity implements View.OnClickListener {

    private EditText ed, ed1, ed2, ed3;
    private Button submit, update;
    private DbHelper help;
    private SQLiteDatabase db;
    private  int id, marks;
    private  String first, last;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_update);

        ed = findViewById(R.id.ed);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);

        update = findViewById(R.id.update);
        submit = findViewById(R.id.submit);

        help = new DbHelper(this, null,null, 1);

        db = openOrCreateDatabase(help.database_name,MODE_PRIVATE,null);

        submit.setOnClickListener(this);
        update.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == submit) {
            id = parseInt(ed.getText().toString());

            Cursor c = help.view(db, id);
            while (c.moveToNext()) {
                first = c.getString(1);
                last = c.getString(2);
                marks = c.getInt(3);
            }
            ed1.setText(first);
            ed2.setText(last);
            ed3.setText(Integer.toString(marks));
        }

        if (v == update){
            help.update(db, id, first, last, marks );

            Toast t = Toast.makeText(this, "Field updated", Toast.LENGTH_SHORT);
            t.show();
        }
    }
}
