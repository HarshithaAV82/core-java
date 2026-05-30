package com.xworkz.oops.interface_concept;

public class Tv implements Remote {


    @Override
    public void on() {
        System.out.println("turn on the tv");
    }

    @Override
    public void remoteInfo() {
        Remote.super.remoteInfo();
    }
}
