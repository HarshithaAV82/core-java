package com.xworkz.employee;

public class CompanyApp {

    public static void main(String[] args) {

        Employee employee =new Developer("Harshitha");
        employee.work();

        Developer developer = (Developer) employee;
        developer.debug();

    }
}
