package com.xworkz.tostringandequals.wire;
public class Wire{
    double size;
    String type;
    double price;
    public Wire(double size, String type, double price){
        this.size = size;
        this.type = type;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Length: " + size + ", Material: " + type + ", Cost: " + price;
    }

    @Override
    public boolean equals(Object obj){
        Wire leftSide=this;
        if(obj instanceof Wire){
            Wire rightSide=(Wire)obj;
            if(leftSide.size==rightSide.size && leftSide.type==rightSide.type && leftSide.price==rightSide.price){
                return true;
            }
        }
        return super.equals(obj);
    }
}