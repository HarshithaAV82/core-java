package com.xworkz.programs.impl;

import com.xworkz.programs.inner.Remote;

public class SonyRemote implements Remote {

    public void turnOn() {
        System.out.println("TV turned ON");
    }

    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}