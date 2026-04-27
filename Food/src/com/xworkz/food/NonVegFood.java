package com.xworkz.food;

public class NonVegFood extends Food {

    public NonVegFood(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing non-veg food: " + name);
    }
}