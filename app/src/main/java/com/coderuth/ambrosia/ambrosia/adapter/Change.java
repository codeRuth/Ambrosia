package com.coderuth.ambrosia.ambrosia.adapter;

import android.os.Parcel;
import android.os.Parcelable;

public class Change implements Parcelable {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Change(String name) {
        this.name = name;
    }
    protected Change(Parcel in) {
        this.name = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
    }

    public static final Parcelable.Creator<Change> CREATOR = new Parcelable.Creator<Change>() {
        @Override
        public Change createFromParcel(Parcel source) {
            return new Change(source);
        }
        @Override
        public Change[] newArray(int size) {
            return new Change[size];
        }
    };
}
