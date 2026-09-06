package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupingByAveraging {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee5> employee5s = new ArrayList<>();

        System.out.println("Enter number of employees:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Enter employee Id:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter departement:");
            String department = scanner.nextLine();

            System.out.println("Enter salary:" );
            int salary = scanner.nextInt();

            employee5s.add(new Employee5(id, name, department,salary));

        }

        Map<String, Double> res = employee5s.stream()
                .collect(Collectors.groupingBy(
                        Employee5::getDepartment,
                        Collectors.averagingInt(Employee5::getSalary)
                ));

        System.out.println("Average Salary by Department:" + res);

        scanner.nextLine();
    }
}
