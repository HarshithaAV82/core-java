package com.xworkz.tostringandequals.sim;

public class Sim{
    String provider;
    String type;
    double price;

    public Sim(String provider, String type, double price){
        this.provider = provider;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Provider: " + provider + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj)
    {
        Sim leftSide = this;
        if(obj instanceof Sim)
        {
            Sim rightSide = (Sim)obj;
            if(leftSide.provider == rightSide.provider &&
                    leftSide.type == rightSide.type &&
                    leftSide.price == rightSide.price)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
