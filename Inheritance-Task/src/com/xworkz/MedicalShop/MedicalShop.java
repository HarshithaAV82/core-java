package com.xworkz.MedicalShop;

import java.util.Arrays;

public class MedicalShop{

    String shopName;
    int items;
    String[] medicines;
    Owner owner;
    MedicalType type;

    public MedicalShop(String shopName, int items, String[] medicines, Owner owner, MedicalType type) {
        this.shopName = shopName;
        this.items = items;
        this.medicines = medicines;
        this.owner = owner;
        this.type = type;
    }

    public void open(){
        System.out.println(" the medical is Open,....");
    }

    public void close(){
        System.out.println("the medical is Close...");
    }

    public String toString(){
        return shopName + ", " + items + ", " + Arrays.toString(medicines) + ", " + owner + ", " + type;
    }
}