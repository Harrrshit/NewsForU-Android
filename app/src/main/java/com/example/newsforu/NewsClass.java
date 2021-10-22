package com.example.newsforu;

import java.util.ArrayList;

public class NewsClass {
    private String status;
    private String totalResults;
    private ArrayList<ApiClass> articles;

    public NewsClass(String status, String totalResults, ArrayList<ApiClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ApiClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ApiClass> articles) {
        this.articles = articles;
    }
}
