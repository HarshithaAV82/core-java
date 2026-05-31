package com.xworkz.oops.abstraction;

public class CoffeeRunner {

    public static void main(String[] args) {

        CappuccinoMachine machine = new CappuccinoMachine();

        machine.powerOn();
        machine.displayDetails();
        machine.makeDrink();
    }
}
