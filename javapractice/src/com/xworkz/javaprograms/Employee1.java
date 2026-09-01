package com.xworkz.javaprograms;

public class Employee1 {

    private String name;
    private double salary;

    public Employee1(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }
}
