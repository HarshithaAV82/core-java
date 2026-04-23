package com.xworkz.Vehicle;

public class ElectricEngineRunner{

    public static void main(String[] args) {
        ElectricEngine electricEngine = new ElectricEngine();
        electricEngine.start();
        electricEngine.checkEnergySource();
        electricEngine.runDiagnostics();
    }
}
