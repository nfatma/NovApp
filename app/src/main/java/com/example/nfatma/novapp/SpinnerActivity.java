package com.example.nfatma.novapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class SpinnerActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner sp;
    private String[] li = {"select_digit", "one", "two", "three", "four"};
    private Toast t;
    private Button bt;
    private AutoCompleteTextView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        sp = findViewById(R.id.sp);
        bt = findViewById(R.id.bt);
        act = findViewById(R.id.act);

        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1, li);
        sp.setAdapter(ad);

        String[] s = getResources().getStringArray(R.array.array);
        ArrayAdapter ad1 = new ArrayAdapter(this,android.R.layout.simple_list_item_1, s);
        act.setAdapter(ad1);

        bt.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        t = Toast.makeText(SpinnerActivity.this, sp.getSelectedItem().toString(), Toast.LENGTH_LONG);
        t.show();
    }
}
