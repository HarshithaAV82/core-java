package com.xworkz.oops.interface_concept;

public class RemoteRunner {

    public static void main(String[] args) {

        Remote tv = new Tv();

        tv.on();
        tv.remoteInfo();

        Remote.off();

        System.out.println(Remote.PRICE);
        System.out.println(Remote.BRAND);
    }
}