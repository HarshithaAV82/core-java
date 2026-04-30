package com.xworkz.smart.inner;

public interface SmartDevice {

   static final String DEVICE_TYPE = "Home Appliance";
    static  final int POWER = 100;

  public abstract void turnOn();
    void turnOff();
    void showStatus();

}
