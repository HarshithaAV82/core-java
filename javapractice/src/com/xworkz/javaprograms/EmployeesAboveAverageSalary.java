package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeesAboveAverageSalary {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee6> employee6s = new ArrayList<>();

        System.out.println("Enter number of employee:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Enter employee Id:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter department:");
            String department = scanner.nextLine();

            System.out.println("Enter salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();

            employee6s.add(new Employee6(id, name, department, salary));
        }

        double averageSalary = employee6s.stream()
                .mapToInt(Employee6::getSalary)
                .average()
                .orElse(0);

        System.out.println("Average Salary:" + averageSalary);

        List<Employee6> result = employee6s.stream()
                .filter(employee6 -> employee6.getSalary() > averageSalary)
                .collect(Collectors.toList());

        System.out.println("Employees with salary above average:");

        for (Employee6 employee6 : result){

            System.out.println(employee6.getName() + " - " + employee6.getSalary());
        }

        scanner.close();
    }
}
