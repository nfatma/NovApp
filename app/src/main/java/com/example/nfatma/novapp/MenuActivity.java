package com.example.nfatma.novapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private int c = 0;
    ArrayList<Integer> n = new ArrayList<Integer>();
    private ListView lt;
    //private MenuItem mt;

    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lt = findViewById(R.id.lv);
        //mt = findViewById(R.id.menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater in = getMenuInflater();
        in.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        c++;
        n.add(c);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, n);
        lt.setAdapter(ad);
        return true;    }
}
