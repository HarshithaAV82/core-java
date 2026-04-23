package com.xworkz.Drawing;

public interface Shape{

    void draw();

    boolean calculateArea();

    default void getColor(){
        System.out.println("Applying default colour is black...");
    }
}
