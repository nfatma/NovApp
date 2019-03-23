package com.example.nfatma.novapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {

    @SerializedName("status")
    private String status;

    @SerializedName("totalResults")
    private String totalResults;

    @SerializedName("articles")
    private List<Articles> articles;

    public class Articles {

        @SerializedName("title")
        private String title;

        @SerializedName("author")
        private String author;

        public Articles(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }


    public String getStatus() {
        return status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public News(String status, String totalResults, List<Articles> articles){
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

}




