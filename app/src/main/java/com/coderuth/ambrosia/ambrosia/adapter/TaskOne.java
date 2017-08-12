package com.coderuth.ambrosia.ambrosia.adapter;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class TaskOne extends ExpandableGroup<Change> {
    private String name, singer, year, url;
    private int rank;

    public TaskOne(String title, List<Change> items, String singer,int rank, String url) {
        super(title, items);
        this.url = url;
        this.singer = singer;
        this.rank = rank;
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
