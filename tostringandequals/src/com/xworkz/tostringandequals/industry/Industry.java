package com.xworkz.tostringandequals.industry;

public class Industry{
    String name;
    String type;
    double revenue;

    public Industry(String name, String type, double revenue){
        this.name = name;
        this.type = type;
        this.revenue = revenue;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Type: " + type + ", Revenue: " + revenue;
    }

    @Override
    public boolean equals(Object obj)
    {
        Industry leftSide = this;
        if(obj instanceof Industry)
        {
            Industry rightSide = (Industry)obj;
            if(leftSide.name == rightSide.name &&
                    leftSide.type == rightSide.type &&
                    leftSide.revenue == rightSide.revenue)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}