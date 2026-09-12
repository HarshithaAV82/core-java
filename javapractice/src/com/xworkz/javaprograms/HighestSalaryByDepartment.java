package com.xworkz.javaprograms;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryByDepartment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee6> employee6s = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Enter employee Id:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter the department:");
            String department = scanner.nextLine();

            System.out.println("Enter salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();

            employee6s.add(new Employee6(id, name,  department,salary));
        }

        Map<String, Optional<Employee6>> res = employee6s.stream()
                .collect(Collectors.groupingBy(
                        Employee6::getDepartment,
                        Collectors.maxBy(
                                Comparator.comparingInt(Employee6::getSalary)
                        )
                ));

        System.out.println("Highest salary employee in each department:");

        for (Map.Entry<String, Optional<Employee6>> entry : res.entrySet()) {

            Employee6 employee6 = entry.getValue().get();

            System.out.println(
                    entry.getKey() + " -> "
                            + employee6.getName() + " - "
                            + employee6.getSalary()
            );
        }
    }
}
