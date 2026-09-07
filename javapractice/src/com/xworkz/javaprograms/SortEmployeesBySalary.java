package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEmployeesBySalary {

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

            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter department:");
            String department = scanner.nextLine();

            System.out.println("Enter salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();

            employee6s.add(new Employee6(id, name, department, salary));
        }

        List<Employee6> result = employee6s.stream()
                .sorted(Comparator.comparingInt(Employee6::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Employees Sorted by Salary:");

        for (Employee6 employee : result) {
            System.out.println(
                    employee.getName() + " - " + employee.getSalary()
            );
        }

        scanner.close();
    }
}
