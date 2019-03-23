package com.example.nfatma.novapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class UserPromptActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_prompt);

        AlertDialog.Builder b = new AlertDialog.Builder(UserPromptActivity.this);
        b.setIcon(R.mipmap.ic_launcher_round);
        b.setCancelable(true);
        b.setTitle("Alert");
        b.setMessage("Are you sure");
        b.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast t = Toast.makeText(UserPromptActivity.this,"alert yep!", Toast.LENGTH_LONG);
                t.show();
            }
        });
        b.setNegativeButton("no", null);

        AlertDialog ad = b.create();
        ad.show();

    }
}
