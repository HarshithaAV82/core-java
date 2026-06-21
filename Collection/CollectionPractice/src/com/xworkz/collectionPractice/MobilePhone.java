package com.xworkz.collectionPractice;

public class MobilePhone implements  Comparable<MobilePhone>{

    int id;
    String brand;
    int price;

    public MobilePhone(int id, String brand, int price){
        this.id=id;
        this.brand=brand;
        this.price=price;
    }

    @Override
    public int compareTo(MobilePhone mobilePhone) {
        return this.price - mobilePhone.price;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}' ;
    }
}
