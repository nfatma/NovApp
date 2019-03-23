package com.example.nfatma.novapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<RecylerViewModel> data;

    public  RecyclerViewAdapter(Context context, List<RecylerViewModel> data){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;

            LayoutInflater vi;
            vi = LayoutInflater.from(context);
            v = vi.inflate(R.layout.recycler_view_model, null);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder myViewHolder, int i) {

        myViewHolder.display_name.setText(data.get(i).getName());
        myViewHolder.display_age.setText(data.get(i).getAge());

    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView display_name, display_age;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            display_name = itemView.findViewById(R.id.name);
            display_age = itemView.findViewById(R.id.age);
        }
    }



}
