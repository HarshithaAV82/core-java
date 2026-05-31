package com.xworkz.oops.abstraction;

public abstract class CoffeeMachine {


    String brand = "Nescafe";
    int price = 5000;

    public abstract void makeDrink();

    public void powerOn(){
        System.out.println("Coffee machine is ON");
    }
    public void displayDetails(){
        System.out.println("Brand:" + brand);
        System.out.println("Price:" + price);
    }
}
