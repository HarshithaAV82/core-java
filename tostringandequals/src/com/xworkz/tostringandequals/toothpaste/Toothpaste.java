package com.xworkz.tostringandequals.toothpaste;
public class Toothpaste{
    String brandName;
    double cost;
    String flavour;

    public Toothpaste(String brandName, double cost, String flavour){
        this.brandName = brandName;
        this.cost = cost;
        this.flavour = flavour;
    }

    @Override
    public String toString()
    {
        return "Brand: " + brandName + ", Cost: " + cost + ", Flavour: " + flavour;
    }

    @Override
    public boolean equals(Object obj)
    {
        Toothpaste leftSide = this;
        if(obj instanceof Toothpaste){
            Toothpaste rightSide = (Toothpaste)obj;
            if(leftSide.brandName == rightSide.brandName && leftSide.cost == rightSide.cost && leftSide.flavour == rightSide.flavour)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}