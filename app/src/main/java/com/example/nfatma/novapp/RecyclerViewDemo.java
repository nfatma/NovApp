package com.example.nfatma.novapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewDemo extends AppCompatActivity {

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);

        RecylerViewModel r1 = new RecylerViewModel("Nahid", "20");
        RecylerViewModel r2 = new RecylerViewModel("Anjali", "19");
        RecylerViewModel r3 = new RecylerViewModel("Nahid", "20");
        RecylerViewModel r4 = new RecylerViewModel("Anjali", "19");

        List<RecylerViewModel> RecyclerViewModelArrayList = new ArrayList<>();
        RecyclerViewModelArrayList.add(r1);
        RecyclerViewModelArrayList.add(r2);
        RecyclerViewModelArrayList.add(r3);
        RecyclerViewModelArrayList.add(r4);


        recycler = findViewById(R.id.RecyclerView);

        RecyclerViewAdapter rva = new RecyclerViewAdapter(this, RecyclerViewModelArrayList);
        recycler.setLayoutManager(new StaggeredGridLayoutManager(2, 0));
        recycler.setAdapter(rva);

    }
}
