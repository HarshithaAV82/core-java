package com.xworkz.SmartDevice;

public interface SmartDevice{

    void turnOn();

    void adjustSetting();

    default void checkWifiStatus(){
        System.out.println("Checking local network ... device is online and ready..");

    }
}
