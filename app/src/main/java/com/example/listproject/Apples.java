package com.example.listproject;

public class Apples {
    private int image;
    private String name;
    private String date;
    private double price;


    public Apples(int image, String name, String date, double price){
        this.image = image;
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public int getImage(){
        return image;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public double getPrice(){
        return price;
    }

}
