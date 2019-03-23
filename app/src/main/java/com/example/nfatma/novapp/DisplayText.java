package com.example.nfatma.novapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayText extends AppCompatActivity {

    private Intent i;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_text);

        tv = findViewById(R.id.tv);
        i = getIntent();
        String name = i.getStringExtra("name");
        tv.setText("hello : "+name);

    }
}
