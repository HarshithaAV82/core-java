package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PartitionEmployees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee1> employees = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Enter the employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter the employee salary:");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees.add(new Employee1(name, salary));
        }

        Map<Boolean, List<Employee1>> result = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary() >= 50000));
        System.out.println("Employees with salary >= 50000: "
                + result.get(true));

        System.out.println("Employees with salary < 50000: "
                + result.get(false));

        scanner.close();
    }
}
