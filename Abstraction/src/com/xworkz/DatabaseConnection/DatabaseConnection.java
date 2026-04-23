package com.xworkz.DatabaseConnection;

public interface DatabaseConnection{

    void  connect();

    void disconnect();

    default void logActivity(){
        System.out.println("running logActivity in Database Connection...");
    }


}
