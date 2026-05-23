package com.xworkz.interview;

public class Register {

    String name;
    String email;

    Register(String name,String email){
        this.name=name;
        this.email=email;
    }

    void showDetails(){
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
    }
}