package com.xworkz.collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeRunner {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        Employee employee = new Employee(22,"harshitha");
        Employee employee1 = new Employee(44,"Manasa");
        Employee employee2 = new Employee(55,"Manu");

        list.add(employee);
        list.add(employee1);
        list.add(employee2);

        Collections.sort(list);

        System.out.println(list);
    }
}
