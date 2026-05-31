package com.xworkz.oops.abstraction;

public class CappuccinoMachine extends CoffeeMachine {
    @Override
    public void makeDrink() {
        System.out.println("Making Cappuccino");
        System.out.println("Heating water");
        System.out.println("Mixing ingredients");
        System.out.println("Controlling temperature");
    }
}
