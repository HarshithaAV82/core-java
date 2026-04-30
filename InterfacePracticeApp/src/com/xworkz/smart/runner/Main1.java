package com.xworkz.smart.runner;

import com.xworkz.smart.impl.SmartDeviceImpl;
import com.xworkz.smart.inner.SmartDevice;

public class Main1 {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDeviceImpl();

        smartDevice.turnOn();
        smartDevice.turnOff();
        smartDevice.showStatus();

        System.out.println(SmartDevice.DEVICE_TYPE);
        System.out.println(SmartDevice.POWER);
    }

}
