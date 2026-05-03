package com.xworkz.strategy;

public class Ride {

    private FareStrategy strategy;

    public void setStrategy(FareStrategy strategy){
        this.strategy=strategy;
    }

    public double calculate(double distance){
        return strategy.calculateFare(distance);
    }
}
