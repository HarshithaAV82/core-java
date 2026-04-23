package com.xworkz.DatabaseConnection;

public class MySQLRunner{

    public static void main(String[] args) {
        MySQLConnection mySQLConnection = new MySQLConnection();
        mySQLConnection.connect();
        mySQLConnection.disconnect();
        mySQLConnection.logActivity();
    }
}
