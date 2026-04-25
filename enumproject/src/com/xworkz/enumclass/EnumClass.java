package com.xworkz.enumclass;

public enum EnumClass {

    DAIRY_MILK(10, 9.9),
    MILKY_BAR(20, 9.5);

    private double price;
    private double weight;

    EnumClass(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Eating ");
    }

    @Override
    public String toString() {

        return   " Price: " + price + ", Weight: " + weight;
    }
}