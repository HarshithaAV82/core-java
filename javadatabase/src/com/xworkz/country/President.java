package com.xworkz.country;
public class President {
    String name;
    int age;
    Address address;

    public President(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void presidentIno(){
        System.out.println("President Name:"+this.name);
        System.out.println("President Age:"+this.age);
        if(address!=null){
            System.out.println("Address:"+this.address);
            address.info();
        }
    }
}