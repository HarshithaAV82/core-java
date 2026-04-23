package com.xworkz.Animal;

public interface Animal {

    void makeSound();

    void  move();

    default void sleep(){
        System.out.println("This animal is now sleeping ...");
    }
}
