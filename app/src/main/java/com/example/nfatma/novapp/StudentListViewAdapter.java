package com.example.nfatma.novapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StudentListViewAdapter extends ArrayAdapter<ModelStudent> {

    private List<ModelStudent> modelStudentArrayList;
    private Context mContext;

    public StudentListViewAdapter(Context context, int resource,List<ModelStudent> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.modelStudentArrayList = objects;
    }

    //@androidx.annotation.NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    View v = convertView;

        if (v == null) {

            LayoutInflater vi;
            vi = LayoutInflater.from(mContext);
            v = vi.inflate(R.layout.student_list_view_1, null);
        }

        ModelStudent student = getItem(position);
        String name = student.getName();
        String age = student.getAge();
        String gender = student.getGender();


        TextView tvName, tvAge, tvGender;

        tvName = v.findViewById(R.id.student_lv_row_name);
        tvAge = v.findViewById(R.id.student_lv_row_age);
        tvGender = v.findViewById(R.id.student_lv_row_gender);

        tvName.setText(name);
        tvAge.setText(age);
        tvGender.setText(gender);

        return v;
    }
}
