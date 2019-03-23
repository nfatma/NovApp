package com.example.nfatma.novapp;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayReg extends AppCompatActivity implements View.OnClickListener {

    private TextView tv1, tv2;
    private Button submit, edit;
    private Intent i;
    private int response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_reg);

        tv1 = findViewById(R.id.first);
        tv2 = findViewById(R.id.email);
        submit = findViewById(R.id.submit);
        edit = findViewById(R.id.edit);

        i = getIntent();
        String name = i.getStringExtra("name");
        tv1.setText(name);
        String email = i.getStringExtra("email");
        tv2.setText(email);


        submit.setOnClickListener(this);
        edit.setOnClickListener(this);

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {

        if (v == submit){
            response = 0;
            finish();
        }
        if (v == edit){
            response = 1;
            finish();
        }

    }

    @Override
    public void finish() {

        Intent res = new Intent();

        res.putExtra("key_status", response);
        setResult(0, res);

        super.finish();
    }

}
/* public void finish(){
     intent res = new Intent();

     res.putExtra("key_Status", response);
     setResult(0, res);

     super.finish;
 */