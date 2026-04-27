package com.xworkz.food;

public class FoodRunner {

    public static void main(String[] args) {

        Food food1 = new VegFood("Paneer", 150);
        Food food2 = new NonVegFood("Chicken", 250);

        Food[] foods = new Food[3];

        StoreFood store = new StoreFood(foods);

        store.save(food1);
        store.save(food2);

        System.out.println("All Foods:");
        store.getAll();

        System.out.println("Order:");
        food1.prepare();
        food2.prepare();
    }
}