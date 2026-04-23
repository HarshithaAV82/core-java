package com.xworkz.Animal;

public class Lion implements  Animal{

    @Override
    public void makeSound() {
        System.out.println("running make Sound in Animal");
    }

    @Override
    public void move() {
        System.out.println("move is running...");
    }
}
