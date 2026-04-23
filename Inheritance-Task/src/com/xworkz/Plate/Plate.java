package com.xworkz.Plate;
import java.util.Arrays;

public class Plate{
    String shape;
    int size;
    String[] uses;
    PlateBrand brand;
    PlateType type;

    public Plate(String shape, int size, String[] uses, PlateBrand brand, PlateType type) {
        this.shape = shape;
        this.size = size;
        this.uses = uses;
        this.brand = brand;
        this.type = type;
    }

    public void use(){
        System.out.println("Using plate when is required..");
    }
    public void wash(){
        System.out.println("Washing the plate after had food.... ");
    }

    public String toString(){
        return shape + ", " + size + ", " + Arrays.toString(uses) + ", " + brand + ", " + type;
    }
}
