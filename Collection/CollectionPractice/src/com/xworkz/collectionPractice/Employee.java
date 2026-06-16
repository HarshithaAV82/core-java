package com.xworkz.collectionPractice;


public class Employee implements Comparable<Employee>{

    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name=name;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.id - employee.id;
    }

    @Override
    public String toString() {

        return "Employee{id=" + id +", name='" + name + "'}";
    }
}
