package com.xworkz.SmartDevice;

public class SmartBulb implements  SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Smart bulb :LED initialized. Light is ON...");
    }

    @Override
    public void adjustSetting() {
        System.out.println("SmartBulb : Adjusting brightness to level...");
    }
}
