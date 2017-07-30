package com.coderuth.ambrosia.ambrosia.models;

/**
 * Created by vamsi on 27-Apr-16.
 */
public class Site {

    private String name, singer, year, url;
    private int pic, rank;

    public Site(String name, String singer, String url, int pic){

        this.name = name;
        this.singer = singer;
        this.url = url;
        this.pic = pic;

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

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
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
