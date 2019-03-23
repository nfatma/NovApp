package com.example.nfatma.novapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ToggleButton tb;
    private Switch sw;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        tb = findViewById(R.id.tb);
        sw = findViewById(R.id.sw);
        img = findViewById(R.id.img);

        tb.setOnCheckedChangeListener(this);
        sw.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(buttonView == tb){
            if(isChecked == true){
                img.setVisibility(View.VISIBLE);
            }
            else{
                img.setVisibility(View.INVISIBLE);
            }
        }
        if(buttonView == sw){
            if(isChecked == true){
                tb.setEnabled(true);
            }
            else{
                tb.setEnabled(false);
            }
        }
    }
}
