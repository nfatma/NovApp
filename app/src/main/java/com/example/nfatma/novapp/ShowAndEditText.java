package com.example.nfatma.novapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShowAndEditText extends AppCompatActivity implements View.OnClickListener {

    private Button click;
    private EditText edd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_and_edit_text);

        click = findViewById(R.id.click_btn);
        edd = findViewById(R.id.eddtxt);

        click.setOnClickListener(this);
        edd.setText("Nahid");
        edd.setFocusable(false);
    }

    @Override
    public void onClick(View v) {
        edd.setFocusableInTouchMode(true);
    }
}
