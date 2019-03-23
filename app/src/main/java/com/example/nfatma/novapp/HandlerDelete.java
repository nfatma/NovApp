package com.example.nfatma.novapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class HandlerDelete extends AppCompatActivity implements View.OnClickListener {

    private EditText ed;
    private Button delete;
    private DbHelper help;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_delete);

        help = new DbHelper(this, null, null, 1);

        db = openOrCreateDatabase(help.database_name, MODE_PRIVATE, null);

        ed = findViewById(R.id.ed);
        delete = findViewById(R.id.delete);

        delete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id;

        if(v == delete){

            id = parseInt(ed.getText().toString());

            help.delete(db, id);

            Toast t = Toast.makeText(this, "Field Deleted", Toast.LENGTH_SHORT);
            t.show();
        }
    }
}
