package com.xworkz.simple;

public class Hospital {

    int  hospitalId = 501;
    String hospitalName = "Apollo";
    String location = "Bangalore";


    void treatment(){
        System.out.println(hospitalName + "provides treatment");
    }

    void display(){
        System.out.println("Hospital Id:" + hospitalId);
        System.out.println("Hospital Name:" + hospitalName);
        System.out.println("Location :" + location);
    }


}
