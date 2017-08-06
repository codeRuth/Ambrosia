package com.coderuth.ambrosia.ambrosia.models;

/**
 * Created by vamsi on 27-Apr-16.
 */
public class Site {

    private String name, singer, year, url;
    private int rank;

    public Site(String name, String singer, String url){

        this.name = name;
        this.singer = singer;
        this.url = url;

    }

    public String getRank() {
        return url;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
