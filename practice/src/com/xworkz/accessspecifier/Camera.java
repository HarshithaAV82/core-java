package com.xworkz.accessspecifier;

public class Camera {

    public String brand = "Canon";
    private int price = 80000;
    protected String lensType = "Wide Angle";
    String color = "Black";

    public void capture() {
        System.out.println("Camera captures photos");
    }

    private void amount() {
        System.out.println("Price : " + price);
    }

    protected void lens() {
        System.out.println("Lens Type : " + lensType);
    }

    void displayColor() {
        System.out.println("Color : " + color);
    }
}