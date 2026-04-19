package com.example.android_app_003_restaurant;

import androidx.annotation.NonNull;

public class Dish {
    String title;
    String description;
    String ingredients;
    double price;

    public Dish(String title, String description, String ingredients, double price) {
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return  title + '\n' +
                description + '\n' +
                "ingredients: " + ingredients + '\n' +
                "price: " + price + '\n';
    }
}
