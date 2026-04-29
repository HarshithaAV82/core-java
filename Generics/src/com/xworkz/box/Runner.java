package com.xworkz.box;

public class Runner {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(100);

        Box<String> stringBox = new Box<>();
        stringBox.set("java");

        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
    }
}
