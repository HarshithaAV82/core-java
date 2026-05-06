package com.xworkz.industry;

public class TechnologyRunner {

    public static void main(String[] args) {

        Industry industry = new Industry();
        industry.pay();

        Technology tech = Technology.COST;
        System.out.println("Technology Cost: " + tech.getCost());
    }
}