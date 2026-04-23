package com.xworkz.DatabaseConnection;

public class MySQLConnection implements  DatabaseConnection{


    @Override
    public void connect() {
        System.out.println("connect method is running MySQL Connection...");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect method is running MySQL connection...");
    }
}
