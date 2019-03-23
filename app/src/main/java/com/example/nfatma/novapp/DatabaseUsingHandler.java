package com.example.nfatma.novapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.nfatma.novapp.DbHelper.table_name;

public class DatabaseUsingHandler extends AppCompatActivity implements View.OnClickListener {

    private Button insert, view, viewAll, update, delete, deleteAll;
    private Intent i;
    private SQLiteDatabase db;
    private DbHelper help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_using_handler);

        insert = findViewById(R.id.insert);
        view = findViewById(R.id.view);
        viewAll = findViewById(R.id.viewAll);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);
        deleteAll = findViewById(R.id.deleteAll);

        help = new DbHelper(this, null,null,1);

        db = openOrCreateDatabase(help.table_name,MODE_PRIVATE,null);

        help.onCreate(db);

        insert.setOnClickListener(this);
        view.setOnClickListener(this);
        viewAll.setOnClickListener(this);
        update.setOnClickListener(this);
        delete.setOnClickListener(this);
        deleteAll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == insert){
            i = new Intent(this, HandlerInsert.class);
            startActivity(i);
        }

        if (v == view){
            i = new Intent(this, HandlerView.class);
            startActivity(i);
        }

        if (v == viewAll){
            i = new Intent(this, HandlerViewAll.class);
            startActivity(i);
        }

        if (v == update){
            i = new Intent(this, HandlerUpdate.class);
            startActivity(i);
        }

        if (v == delete){
            i = new Intent(this, HandlerDelete.class);
            startActivity(i);
        }

        if (v == deleteAll){
            i = new Intent(this, HandlerDeleteAll.class);
            startActivity(i);
        }
    }
}
