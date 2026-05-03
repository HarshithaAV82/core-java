package com.xworkz.strategy;

public class NormalFare implements FareStrategy{
    @Override
    public double calculateFare(double distance) {
        return distance * 10;
    }
}
