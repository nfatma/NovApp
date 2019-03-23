package com.example.nfatma.novapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCalling extends AppCompatActivity {

    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_calling);

        Retrofit r = new Retrofit.Builder().baseUrl("https://newsapi.org/v2/").addConverterFactory(GsonConverterFactory.create()).build();

        ApiInterface ai = r.create(ApiInterface.class);
        ai.getResult().enqueue(new Callback<News>(){
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                try{
                    if(response.body().getStatus().equalsIgnoreCase("ok")){
                        generateNewsList(response.body().getArticles());
                    }
                }

                catch (Exception e){

                }
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
            }
        });
    }

    private void generateNewsList(List<News.Articles> newsArrayList) {
        rv = findViewById(R.id.api_recycler);
        ApiAdapter aa = new ApiAdapter(this, newsArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(aa);
    }
}
