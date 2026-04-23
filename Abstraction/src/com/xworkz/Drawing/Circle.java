package com.xworkz.Drawing;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a circle..");
    }

    @Override
    public boolean calculateArea() {
        System.out.println("return calculate area in circle...");
        return true;
    }
}