package com.xworkz.industry;

public enum Technology {

    COST(20000);

    private double cost;

    Technology(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}