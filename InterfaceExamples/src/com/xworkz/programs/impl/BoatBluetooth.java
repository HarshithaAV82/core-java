package com.xworkz.programs.impl;

import com.xworkz.programs.inner.Bluetooth;

public class BoatBluetooth implements Bluetooth {

    public void connect() {
        System.out.println("Bluetooth connected");
    }

    public void disConnect() {
        System.out.println("Bluetooth disconnected");
    }
}