package com.example.nfatma.novapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurdActivity extends AppCompatActivity implements View.OnClickListener {

    private Button add, delete, update, view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curd);

        add = findViewById(R.id.ADD);
        delete = findViewById(R.id.DELETE);
        update = findViewById(R.id.UPDATE);
        view = findViewById(R.id.VIEW);

        add.setOnClickListener(this);
        delete.setOnClickListener(this);
        update.setOnClickListener(this);
        view.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == add){
            Intent i = new Intent(CurdActivity.this, addActivity.class);
            startActivity(i);
        }
        if(v == delete){
            Intent i = new Intent(CurdActivity.this, deleteActivity.class);
            startActivity(i);
        }
        if (v == update){
            Intent i = new Intent(CurdActivity.this, updateActivity.class);
            startActivity(i);
        }
        if (v == view){
            Intent i = new Intent(CurdActivity.this, viewActivity.class);
            startActivity(i);
        }
    }
}
