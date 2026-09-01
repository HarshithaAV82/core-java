package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupEmployees {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++){
            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter department:");
            String department = scanner.nextLine();

            list.add(new Employee(name, department));
        }

        Map<String, List<Employee>> groupedEmployees = list.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        System.out.println("Employees Grouped by department:");
        groupedEmployees.forEach((department, employeeList) -> {
            System.out.println(department + ":" + employeeList);
        });

        scanner.close();
    }
}
