package com.xworkz.country;

public class State {
    String name;
    double population;
    City[] cities;

    public State(String name, double population, City[] cities){
        this.name = name;
        this.population = population;
        this.cities = cities;
    }

    public void stateInfo(){
        System.out.println("State Name: " + this.name);
        System.out.println("State Population: " + this.population);

        if (cities != null) {
            for (City city : cities) {
                if (city != null){
                    city.cityInfo();
                }
            }
        }
    }
}