package com.xworkz.employee;

public class Developer extends Employee{
    public Developer(String name) {
        super(name);
    }
    void work(){
        System.out.println(name + "is writing code");
    }
    void debug(){
        System.out.println(name + "is debugging");
    }
}
