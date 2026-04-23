package com.xworkz.Vehicle;

public interface Engine{

    void start();

    void checkEnergySource();

    default void runDiagnostics(){
        System.out.println("System check and monitoring temperature and pressure...");
    }
}
