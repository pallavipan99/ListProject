package com.example.listproject;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Apples implements Parcelable{
    private int image;
    private String name;
    private String date;
    private String  price;
    private String context;

    public Apples(int image, String name, String date, String price,  String context){
        this.image = image;
        this.name = name;
        this.date = date;
        this.price = price;
        this.context = context;

    }

    protected Apples(Parcel in) {
        image = in.readInt();
        name = in.readString();
        date = in.readString();
        price = in.readString();
        context = in.readString();
    }

    public static final Creator<Apples> CREATOR = new Creator<Apples>() {
        @Override
        public Apples createFromParcel(Parcel in) {
            return new Apples(in);
        }

        @Override
        public Apples[] newArray(int size) {
            return new Apples[size];
        }
    };

    public int getImage(){
        return image;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public String getPrice() {
        return price;
    }

    public String getContext(){
      return context;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(name);
        dest.writeString(date);
        dest.writeString(price);
        dest.writeString(context);
    }
}