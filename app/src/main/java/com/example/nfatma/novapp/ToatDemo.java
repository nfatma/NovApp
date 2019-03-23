package com.example.nfatma.novapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToatDemo extends AppCompatActivity implements View.OnClickListener {

    private Button bt, btN, btP;
    private Toast t ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toat_demo);

        bt = findViewById(R.id.bt1);
        btN = findViewById(R.id.btnN);
        btP = findViewById(R.id.btnP);

        bt.setOnClickListener(this);
        btN.setOnClickListener(this);
        btP.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == bt) {
            t = Toast.makeText(ToatDemo.this, "You are staying in the same Activity", Toast.LENGTH_LONG);
            t.show();
        }
        if(v == btN){
            Intent i = new Intent(ToatDemo.this, NavDemo.class);
            startActivity(i);
        }
        if(v == btP){
            onBackPressed();
        }
    }
}
