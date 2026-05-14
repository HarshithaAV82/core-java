package com.xworkz.accessspecifier;

public class Phone {

    public String brand = "OnePlus";
    private int password = 1234;
    protected String processor = "Snapdragon";
    String color = "Black";

    public void call() {
        System.out.println("Calling feature");
    }

    private void security() {
        System.out.println("Password : " + password);
    }

    protected void performance() {
        System.out.println("Processor : " + processor);
    }

    void displayColor() {
        System.out.println("Color : " + color);
    }
}