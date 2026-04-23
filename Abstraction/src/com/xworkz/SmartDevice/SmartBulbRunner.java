package com.xworkz.SmartDevice;

public class SmartBulbRunner{

    public static void main(String[] args) {
        SmartBulb smartBulb = new SmartBulb();
        smartBulb.turnOn();
        smartBulb.adjustSetting();
        smartBulb.checkWifiStatus();
    }
}
