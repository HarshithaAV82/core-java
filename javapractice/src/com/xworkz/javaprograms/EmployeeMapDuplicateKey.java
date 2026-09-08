package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeMapDuplicateKey {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee6> employee6List = new ArrayList<>();

        System.out.println("Enter num of employee:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Enter employee Id:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter the department:");
            String department = scanner.nextLine();

            System.out.println("Enter salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();

            employee6List.add(new Employee6(id, name, department, salary));
        }

        Map<Integer, String> result = employee6List.stream()
                .collect(Collectors.toMap(
                        Employee6::getId,
                        Employee6::getName,
                        (existing, replacement) -> existing
                ));
        System.out.println("Employee Map:" + result);

        scanner.close();
    }
}
