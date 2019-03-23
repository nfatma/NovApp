package com.example.nfatma.novapp;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NavDemo extends AppCompatActivity implements View.OnClickListener {

    private Button btP, btE, btS, bt, stopService;
    private EditText ed;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_demo);

        btP = findViewById(R.id.btnP);
        btE = findViewById(R.id.btnE);
        btS = findViewById(R.id.btnS);
        bt = findViewById(R.id.bt);
        ed = findViewById(R.id.ed);
        stopService = findViewById(R.id.stopService);

        btP.setOnClickListener(this);
        btE.setOnClickListener(this);
        btS.setOnClickListener(this);
        bt.setOnClickListener(this);
        bt.setOnClickListener(this);

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {
        i = new Intent(this, DemoService.class);

        if(v == btP){
            onBackPressed();
        }
        if(v == btE){
            finishAffinity();
        }
        if(v == btS){
            i = new Intent(this, DisplayText.class);
            i.putExtra("name", ed.getText().toString()); // getText() SHOULD NOT be static!!!
            startActivity(i);
        }
        if (v == bt){
            startService(i);
        }
        if (v == stopService){
            stopService(i);
        }
    }
}
