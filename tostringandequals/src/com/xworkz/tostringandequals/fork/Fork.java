package com.xworkz.tostringandequals.fork;
public class Fork{
    int size;
    String material;
    double price;

    public Fork(int size, String material, double price){
        this.size = size;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Size: " + size + ", Material: " + material + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj)
    {
        Fork leftSide = this;
        if(obj instanceof Fork)
        {
            Fork rightSide = (Fork)obj;
            if(leftSide.size == rightSide.size &&
                    leftSide.material == rightSide.material &&
                    leftSide.price == rightSide.price)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
