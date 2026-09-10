package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeNamesByDepartment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee6> employee6s = new ArrayList<>();

        System.out.println("Enter number of employees:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Enter employee Id:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the name:");
            String name = scanner.nextLine();
            System.out.println("ENter department:");
            String department = scanner.nextLine();

            System.out.println("ENter the salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();

            employee6s.add(new Employee6(id, name, department, salary));
        }

        System.out.println("ENter department to find employee:");
        String searchDepartment = scanner.nextLine();

        List<String> result = employee6s.stream()
                .filter(employee6 -> employee6.getDepartment()
                        .equalsIgnoreCase(searchDepartment))
                .map(Employee6::getName)
                .collect(Collectors.toList());

        System.out.println("Employee in" +  " " + searchDepartment + " :" + result);
    }
}
