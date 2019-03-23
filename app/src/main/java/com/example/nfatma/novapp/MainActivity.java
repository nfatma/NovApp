package com.example.nfatma.novapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    private Button btR;
    private Button btI;
    private Button btD;
    private Button btN;
    private TextView val;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btR = findViewById(R.id.btnR);
        btI = findViewById(R.id.btnI);
        btD = findViewById(R.id.btnD);
        btN = findViewById(R.id.btnN);
        val = findViewById(R.id.txt);
        
        btR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                val.setText(Integer.toString(counter));
            }
        });

        btI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                val.setText(Integer.toString(counter));
            }
        });

        btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                val.setText(Integer.toString(counter));
            }
        });

        btN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ToatDemo.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        SharedPreferences sp = getSharedPreferences("counter", MODE_PRIVATE);
        String count = sp.getString("c","0");
        val.setText(count);
        counter = parseInt(count);
    }

    @Override
    protected void onStop() {
        super.onStop();

        SharedPreferences sp = getSharedPreferences("counter", MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString("c",Integer.toString(counter));
        ed.commit();
    }
}
