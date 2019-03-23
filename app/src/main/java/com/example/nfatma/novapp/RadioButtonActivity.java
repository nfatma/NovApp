package com.example.nfatma.novapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton r1, r2, r3;
    private Button bt;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        tv = findViewById(R.id.tv);
        bt = findViewById(R.id.bt);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        bt.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if(v == bt){

            String s = "Greeting Style";

            if(r1.isChecked()){
                s = s + "\n" + r1.getText().toString();
            }
            else if(r2.isChecked()){
                s = s + "\n" + r2.getText().toString();
            }
            else if(r3.isChecked()){
                s = s + "\n" + r3.getText().toString();
            }

            tv.setText(s);
        }

    }
}
