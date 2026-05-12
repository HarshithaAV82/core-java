package com.xworkz.programs.outer;

import com.xworkz.programs.inner.Bluetooth;

public class MobileDevice {

    Bluetooth bluetooth;

    public MobileDevice(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void shareFiles() {

        System.out.println("Sharing files");

        if(bluetooth != null) {

            bluetooth.connect();

            System.out.println("Files shared successfully");

            bluetooth.disConnect();
        }
    }
}