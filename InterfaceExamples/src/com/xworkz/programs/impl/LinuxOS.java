package com.xworkz.programs.impl;
import com.xworkz.programs.inner.OperatingSystem;

public class LinuxOS implements OperatingSystem {

    public void boot() {
        System.out.println("Linux OS booting");
    }

    public void start() {
        System.out.println("Linux OS started");
    }

    public void stop() {
        System.out.println("Linux OS stopped");
    }
}