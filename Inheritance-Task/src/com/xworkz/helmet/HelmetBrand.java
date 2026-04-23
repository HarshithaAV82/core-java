package com.xworkz.helmet;

public class HelmetBrand{
    String brandName;
    String country;

    public HelmetBrand(String brandName, String country){
        this.brandName = brandName;
        this.country = country;

        System.out.println("Brand Name: " + this.brandName);
        System.out.println("Country: " + this.country);
    }

    @Override
    public String toString(){
        return "Brand Name: " + brandName + ", Country: " + country;
    }
}
