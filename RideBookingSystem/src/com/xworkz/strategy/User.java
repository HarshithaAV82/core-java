package com.xworkz.strategy;

public class User {

    private String name;

    public User(String name){
        this.name=name;
    }

    public void bookRide(Ride ride, double distane){
        double fare = ride.calculate(distane);
        System.out.println(name + " " + "booked ride.");
        System.out.println("Fare:" + fare);
    }
}
