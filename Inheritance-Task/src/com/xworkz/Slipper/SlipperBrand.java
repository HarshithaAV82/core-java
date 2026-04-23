package com.xworkz.Slipper;

public class SlipperBrand{

    String brandName;
    String country;

    public SlipperBrand(String brandName, String country){
        this.brandName = brandName;
        this.country = country;
        System.out.println("Brand Name:" + this.brandName);
        System.out.println("Brand Country:" + this.country);
    }

    @Override
    public String toString(){
        return "Brand Name:" + brandName + " Country:" + country;
    }
}

