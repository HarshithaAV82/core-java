package com.xworkz.programs.outer;

import com.xworkz.programs.inner.OperatingSystem;

public class LenovoLaptop {

    OperatingSystem operatingSystem;

    public LenovoLaptop(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void runSystem() {

        System.out.println("Laptop running");

        if(operatingSystem != null) {
            operatingSystem.boot();
            operatingSystem.start();
            operatingSystem.stop();
        }
    }
}