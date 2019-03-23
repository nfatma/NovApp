package com.example.nfatma.novapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SharedPreferance extends AppCompatActivity implements View.OnClickListener {

    private EditText edt;
    private Button save, ret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferance);

        edt = findViewById(R.id.ed);
        save = findViewById(R.id.btS);
        ret = findViewById(R.id.btR);

        save.setOnClickListener(this);
        ret.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == save){
            SharedPreferences sp = getSharedPreferences("text", Context.MODE_PRIVATE);

            SharedPreferences.Editor ed = sp.edit();
            ed.putString("name", edt.getText().toString());
            ed.commit();
        }
        if(v == ret){
            SharedPreferences sp = getSharedPreferences("text", Context.MODE_PRIVATE);
            String s = sp.getString("name", "NoName");
            edt.setText(s);

        }
    }
}
