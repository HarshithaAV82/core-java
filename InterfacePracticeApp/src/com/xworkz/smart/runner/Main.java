package com.xworkz.smart.runner;

import com.xworkz.smart.impl.SmartDeviceImpl;
import com.xworkz.smart.inner.SmartDevice;

public class Main {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDeviceImpl();

        smartDevice.turnOn();
        smartDevice.turnOff();
        smartDevice.showStatus();
    }

}
