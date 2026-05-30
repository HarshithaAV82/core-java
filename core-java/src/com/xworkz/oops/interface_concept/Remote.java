package com.xworkz.oops.interface_concept;

public interface Remote {


    int PRICE = 1000;             // public static final

    String BRAND = "LG";           // public static final


    void on();                       // public abstract


    static void off() {                // static method with body
        System.out.println("Turn Off of the tv");
    }

    default void remoteInfo() {      // default method
        System.out.println("remote brand is LG Brand");
    }

}

// private method java feature java 9
// static method - java 8
// default method - java 8