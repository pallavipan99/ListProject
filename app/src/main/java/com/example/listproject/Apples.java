package com.example.listproject;

public class Apples {
    private int image;
    private String name;
    private String date;
    private double price;
    private String context;

    public Apples(int image, String name, String date, double price,  String context){
        this.image = image;
        this.name = name;
        this.date = date;
        this.price = price;
        this.context = context;

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

    public double getPrice() {
        return price;
    }

    public String getContext(){
      return context;
    }


}
