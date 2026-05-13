package com.xworkz.simple;

class Mobile {

    String brand = "Samsung";
    int price = 25000;
    String color = "Black";

    void details() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
    }

    void calling() {
        System.out.println("Calling feature is available");
    }

    void gaming() {
        System.out.println("Games can be played");
    }

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.details();
        mobile.calling();
        mobile.gaming();
    }
}