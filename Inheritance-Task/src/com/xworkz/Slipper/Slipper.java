package com.xworkz.Slipper;

import java.util.Arrays;

public class Slipper{
    boolean isWaterproof;
    double price;
    String[] colors;
    SlipperBrand brand;
    Material material;

    public Slipper(boolean isWaterproof, double price, String[] colors, SlipperBrand brand, Material material) {
        this.isWaterproof = isWaterproof;
        this.price = price;
        this.colors = colors;
        this.brand = brand;
        this.material = material;
    }

    public void slipperInfo(){

        System.out.println("Executing the Slipper Info in Slipper Class");
    }

    public void materialInfo(){

        System.out.println("Executing the Material Info in Slipper Class");
    }

    @Override
    public String toString(){
        return "Waterproof:" + this.isWaterproof + ", Price:" + price + ", Colors:" + Arrays.toString(colors) + ", Brand:" + brand + ", Material:" + material;
    }
}