package com.example.nfatma.novapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ApiAdapter extends RecyclerView.Adapter<ApiAdapter.MyViewHolder> {

    private Context context;
    private List<News.Articles> news;

    public ApiAdapter(Context context, List<News.Articles> news){
        this.context = context;
        this.news = news;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v;

        LayoutInflater vi;
        vi = LayoutInflater.from(context);
        v = vi.inflate(R.layout.news_display, null);
        return new ApiAdapter.MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.display_title.setText(news.get(i).getTitle());
        myViewHolder.display_author.setText(news.get(i).getAuthor());

    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView display_title, display_author;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            display_title = itemView.findViewById(R.id.name);
            display_author = itemView.findViewById(R.id.author);
        }
    }

}
