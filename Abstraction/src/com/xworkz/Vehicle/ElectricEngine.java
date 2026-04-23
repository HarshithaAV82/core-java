package com.xworkz.Vehicle;

public class ElectricEngine implements  Engine{
    @Override
    public void start() {
        System.out.println("Electric engine engaging battery relay...");
    }

    @Override
    public void checkEnergySource() {
        System.out.println("Electric engine battery level at 85%.");
    }
}
