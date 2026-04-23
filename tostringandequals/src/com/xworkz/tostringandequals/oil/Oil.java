package com.xworkz.tostringandequals.oil;

public class Oil{
    String name;
    String type;
    double price;

    public Oil(String name, String type, double price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj)
    {
        Oil leftSide = this;
        if(obj instanceof Oil)
        {
            Oil rightSide = (Oil)obj;
            if(leftSide.name == rightSide.name &&
                    leftSide.type == rightSide.type &&
                    leftSide.price == rightSide.price)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}