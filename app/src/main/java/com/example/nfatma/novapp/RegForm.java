package com.example.nfatma.novapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegForm extends AppCompatActivity implements View.OnClickListener {

    private EditText name, email;
    private Button submit;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_form);

        name = findViewById(R.id.first);
        email = findViewById(R.id.email);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == submit){
            Intent i = new Intent(this, DisplayReg.class);
            i.putExtra("name", name.getText().toString()); // getText() SHOULD NOT be static!!!
            i.putExtra("email", email.getText().toString()); // getText() SHOULD NOT be static!!!

            startActivityForResult(i,0);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        i = getIntent();
        String name = i.getStringExtra("key_status");
        if (name == "0"){
            finish();
        }
        if (name =="1") {
            Toast t = Toast.makeText(this, "stay", Toast.LENGTH_LONG);
            t.show();
        }
    }
}


