package com.xworkz.enumclass;

public class EnumRunner {

    public static void main(String[] args) {

        Kitkat kitkat = new Kitkat();
        kitkat.eat();
        EnumClass enumClass = EnumClass.DAIRY_MILK;
        enumClass.eat();

    }
}