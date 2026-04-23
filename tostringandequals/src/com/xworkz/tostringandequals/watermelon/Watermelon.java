package com.xworkz.tostringandequals.watermelon;

public class Watermelon{
    double size;
    String variety;
    double cost;

    public Watermelon(double size, String variety, double cost){
        this.size = size;
        this.variety = variety;
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "Size: " + size + ", Variety: " + variety + ", Cost: " + cost;
    }

    @Override
    public boolean equals(Object obj){
        Watermelon leftSide=this;
        if(obj instanceof Watermelon){
            Watermelon rightSide=(Watermelon)obj;
            if(leftSide.size==rightSide.size && leftSide.variety==rightSide.variety && leftSide.cost==rightSide.cost)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}