package com.example.nfatma.novapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox cb1, cb2, cb3;
    private TextView tv;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        tv = findViewById(R.id.tv);
        bt = findViewById(R.id.bt);

        cb1.setOnClickListener(this);
        cb2.setOnClickListener(this);
        cb3.setOnClickListener(this);
        bt.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == bt){

            String s = "Names: ";

            if(cb1.isChecked()){
                s = s + "\n" + cb1.getText().toString();
            }
            if(cb2.isChecked()){
                s = s + "\n" + cb2.getText().toString();
            }
            if(cb3.isChecked()){
                s = s + "\n" + cb3.getText().toString();
            }

            tv.setText(s);
        }
    }
}
