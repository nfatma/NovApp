package com.example.nfatma.novapp;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileDemo extends AppCompatActivity implements View.OnClickListener {

    private Button bts, btr;
    private EditText name, email;
    private RelativeLayout rl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_demo);

        bts = findViewById(R.id.btSave);
        btr = findViewById(R.id.btRev);
        name = findViewById(R.id.first);
        email = findViewById(R.id.email);
        rl = findViewById(R.id.parent);

        bts.setOnClickListener(this);
        btr.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btr) {
            try {

                FileInputStream fis = openFileInput("abc.txt");
                String content = "";

                while (true) {
                    int a = fis.read();
                    if (a == -1)
                        break;
                    content += (char) a;
                    name.setText(content);
                }
            } catch (FileNotFoundException e) {
            } catch (IOException e) {
                e.printStackTrace();
            }

            Snackbar sb = Snackbar.make(rl, "hey! I m snackbar of Retrieve", Snackbar.LENGTH_LONG);
            sb.show();
        }
        else{
            String data = email.getText().toString();

            try{
                FileOutputStream fos = openFileOutput("abc.txt",0);
                for(int i =0;i<data.length();i++){
                    char c = data.charAt(i);
                    fos.write(c);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Snackbar sb = Snackbar.make(rl, "hey! I m snackbar of show", Snackbar.LENGTH_INDEFINITE);
            sb.show();

        }
    }
}
