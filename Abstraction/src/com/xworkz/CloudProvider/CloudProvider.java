package com.xworkz.CloudProvider;

public interface CloudProvider {

    void uploadFile();

    void authenticate();

    default void establishConnection() {
        System.out.println("executing establishConnection in CloudProvider...");
    }
}