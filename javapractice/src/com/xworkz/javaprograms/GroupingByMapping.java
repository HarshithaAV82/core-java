package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupingByMapping {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee3> employee3s = new ArrayList<>();

        System.out.println("Enter number of employees:");
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

            employee3s.add(new Employee3(id, name, department));

            Map<String, List<String>> result = employee3s.stream()
                    .collect(Collectors.groupingBy(
                            Employee3::getDepartment,
                            Collectors.mapping(
                                    Employee3::getName,
                                    Collectors.toList()
                                    )
                    ));

            System.out.println("Employees by Department:" + result);

            scanner.close();
        }
    }
}
