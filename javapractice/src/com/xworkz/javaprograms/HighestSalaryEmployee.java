package com.xworkz.javaprograms;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryEmployee {

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

            System.out.println("Enter the department:");
            String department = scanner.nextLine();

            System.out.println("Enter salary");
            int salary = scanner.nextInt();
            scanner.nextLine();
            employee6s.add(new Employee6(id, name, department,salary));
        }

        List<Employee6> highestSalaryEmployee = employee6s.stream()
                .sorted(Comparator.comparingInt(Employee6::getSalary).reversed())
                .collect(Collectors.toList());

        if (highestSalaryEmployee != null){
            System.out.println("Highest Salary Employee:" + highestSalaryEmployee.get(0).getName());

            System.out.println("Salary: " + highestSalaryEmployee.get(0).getSalary());
        }else {
            System.out.println("No employees found.");
        }

        scanner.close();
    }
}
