package com.example.anew.msbuddy;

/**
 * Created by New on 27/01/2018.
 */
public class article_uni {

    private String title;
    private String rank;

    public article_uni() {
    }


    public article_uni(String title ,String rank) {
        this.title = title;

        this.rank = rank;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }


    public String getRank() {
        return rank;
    }

    public void setRank(String name) {
        this.rank = name;
    }


}
