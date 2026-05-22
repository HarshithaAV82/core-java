package com.xworkz.company;

import java.util.ArrayList;

class Company {
    String companyName;

    Company(String companyName) {
        this.companyName = companyName;
    }

    void showCompany() {
        System.out.println("Company: " + companyName);
    }
}

class Employee extends Company {
    int id;
    String name;

    Employee(String companyName, int id, String name) {
        super(companyName);
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    void display(String department) {
        System.out.println("Department: " + department);
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread Started");
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Employee e1 = new Employee("Tech Solutions", 101, "Harshitha");

        e1.showCompany();
        e1.display();
        e1.display("IT");

        int salary[] = {20000, 25000, 30000};

        System.out.println("Salary Details:");
        for(int i = 0; i < salary.length; i++) {
            System.out.println(salary[i]);
        }

        ArrayList<String> skills = new ArrayList<>();
        skills.add("Java");
        skills.add("HTML");
        skills.add("SQL");

        System.out.println("Skills:");
        for(String s : skills) {
            System.out.println(s);
        }

        MyThread t = new MyThread();
        t.start();
    }
}