package com.xworkz.strategy;

public class PremiumFare implements FareStrategy{
    @Override
    public double calculateFare(double distance) {
        return distance * 20 + 50;
    }
}
