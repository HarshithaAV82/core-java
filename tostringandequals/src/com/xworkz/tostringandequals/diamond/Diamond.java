package com.xworkz.tostringandequals.diamond;
public class Diamond{
    double weight;
    String type;
    double price;

    public Diamond(double weight, String type, double price){
        this.weight = weight;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Weight: " + weight + ", Type: " + type + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj)
    {
        Diamond leftSide = this;
        if(obj instanceof Diamond)
        {
            Diamond rightSide = (Diamond)obj;
            if(leftSide.weight == rightSide.weight &&
                    leftSide.type == rightSide.type &&
                    leftSide.price == rightSide.price)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}