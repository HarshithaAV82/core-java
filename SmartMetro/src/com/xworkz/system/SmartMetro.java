package com.xworkz.system;

public class SmartMetro {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("Hema", 101, 188);
        Admin admin = new Admin("Acchu", 300);

        System.out.println("Passenger Name:" + passenger.getName());
        passenger.showBalance();
        passenger.showRole();
        passenger.recharge(30);

        System.out.println("Admin Name:" + admin.getName());
        admin.showRole();
        admin.manageSystem();

    }
}
