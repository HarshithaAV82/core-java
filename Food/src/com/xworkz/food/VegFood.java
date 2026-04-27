package com.xworkz.food;

public class VegFood extends Food {

    public VegFood(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing vegetarian food: " + name);
    }
}