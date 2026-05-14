package com.xworkz.accessspecifier;

public class Speaker {

    public String brand = "JBL";
    private int price = 12000;
    protected String soundType = "Bass";
    String color = "Red";

    public void playMusic() {
        System.out.println("Music is playing");
    }

    private void showPrice() {
        System.out.println("Price : " + price);
    }

    protected void sound() {
        System.out.println("Sound Type : " + soundType);
    }

    void displayColor() {
        System.out.println("Color : " + color);
    }
}