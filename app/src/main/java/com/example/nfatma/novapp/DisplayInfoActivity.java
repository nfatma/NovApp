package com.example.nfatma.novapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayInfoActivity extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        i = getIntent();
        tv1 = findViewById(R.id.tv1);
        String name = i.getStringExtra("name");
        tv1.setText("name : "+name);

        tv2 = findViewById(R.id.tv2);
        String email = i.getStringExtra("email");
        tv2.setText("email : "+email);

        tv3 = findViewById(R.id.tv3);
        String stud = i.getStringExtra("stud");
        if (stud != null){
            tv3.setVisibility(View.VISIBLE);
            tv3.setText("designation : "+stud);
        }


        tv4 = findViewById(R.id.tv4);
        String course = i.getStringExtra("course");
        if (course != null){
            tv4.setVisibility(View.VISIBLE);
            tv4.setText("course : "+course);
        }
        
    }
}
