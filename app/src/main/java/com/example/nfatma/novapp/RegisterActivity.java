package com.example.nfatma.novapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt;
    private CheckBox cb;
    private RadioGroup rg;
    private RadioButton rb1, rb2, rb3;
    private EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        bt = findViewById(R.id.bt);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        cb = findViewById(R.id.cb);
        rg = findViewById(R.id.rGroup);

        bt.setOnClickListener(this);
        cb.setOnClickListener(this);
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == cb && cb.isChecked()){
            rg.setVisibility(View.VISIBLE);
            }
        if (v == cb && !cb.isChecked()){
            rg.setVisibility(View.INVISIBLE);
        }

         if (v == bt){
             Intent i = new Intent(this, DisplayInfoActivity.class);
             i.putExtra("name", ed1.getText().toString()); // getText() SHOULD NOT be static!!!
             i.putExtra("email", ed2.getText().toString()); // getText() SHOULD NOT be static!!!
             if (cb.isChecked()){
                 i.putExtra("stud", cb.getText().toString());
                 if (rb1.isChecked()){
                     i.putExtra("course", rb1.getText().toString());
                 }
                 else if (rb2.isChecked()){
                     i.putExtra("course", rb2.getText().toString());
                 }
                 else if (rb3.isChecked()){
                     i.putExtra("course", rb3.getText().toString());
                 }
             }
             startActivity(i);
             }

    }
}
