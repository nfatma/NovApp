package com.example.nfatma.novapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("top-headlines?sources=google-news-in&apiKey=6cd4cc56897c46e7be3b6f1bfe8c9953")
    Call<News> getResult();

}
