package com.example.nfatma.novapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewModelClassDemo extends AppCompatActivity {

    private ListView lt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_model_class_demo);

        ModelStudent m1 = new ModelStudent("Nahid", "20", "Female");
        ModelStudent m2 = new ModelStudent("Aditi", "20", "Female");
        ModelStudent m3 = new ModelStudent("Anjali", "20", "Female");
        ModelStudent m4 = new ModelStudent("Kolla", "20", "Female");
        ModelStudent m5 = new ModelStudent("Narayan", "20", "male");

        List<ModelStudent> modelStudentArrayList = new ArrayList<ModelStudent>();
        modelStudentArrayList.add(m1);
        modelStudentArrayList.add(m2);
        modelStudentArrayList.add(m3);
        modelStudentArrayList.add(m4);
        modelStudentArrayList.add(m5);

        lt = findViewById(R.id.lv);

        StudentListViewAdapter sad = new StudentListViewAdapter(this, R.layout.student_list_view_1, modelStudentArrayList);
        lt.setAdapter(sad);


    }
}
