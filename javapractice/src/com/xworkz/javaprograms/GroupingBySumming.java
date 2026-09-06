package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupingBySumming {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee4> employee4s = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Enter employee ID:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter department:");
            String department = scanner.nextLine();

            System.out.println("Enter salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();

            employee4s.add(new Employee4(id, name, department, salary));

        }

        Map<String, Integer> res = employee4s.stream()
                .collect(Collectors.groupingBy(
                        Employee4::getDepartment,
                        Collectors.summingInt(Employee4::getSalary)
                ));

        System.out.println("Total Salary by Department:" + res);

        scanner.close();
    }
}
