package com.xworkz.strategy;

import java.util.Scanner;

public class RideApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ride ride = new Ride();
        User user = new User("Harshitha");

        System.out.println("Enter distance:");
        double distance = scanner.nextDouble();

        System.out.println("Choose Ride Type: 1. Normal  2: Premium");
        int choice = scanner.nextInt();

        if(choice == 1) {
            ride.setStrategy(new NormalFare());
        }

        else {
            ride.setStrategy(new PremiumFare());
        }

        user.bookRide(ride,distance);
    }
}
