package com.xworkz.smart.impl;

import com.xworkz.smart.inner.SmartDevice;

public class SmartDeviceImpl  implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Device is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Device is turned OFF");
    }

    @Override
    public void showStatus() {
        System.out.println("Device is working properly");
    }
}
