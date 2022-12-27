package com.example.starbuzzy;

import androidx.annotation.NonNull;

public class DrinkModel {
    private String title;
    private String description;
    private int imageResourceId;

    private DrinkModel(String title, String description, int imageResourceId){
        this.description = description;
        this.title = title;
        this.imageResourceId = imageResourceId;
    }

    public static final DrinkModel[] drink = {
            new DrinkModel("Filter", "Freshly roasted coffee", R.drawable.filter),
            new DrinkModel("Latte", "Expresso with a warm milks", R.drawable.latte),
            new DrinkModel("Cappuccino", "Expresso with cream and pressured milk", R.drawable.cappuccino),

    };

    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public  int getImageResourceId(){
        return imageResourceId;
    }

    @NonNull
    public String toString(){
        return this.title;
    }
}
