package com.xworkz.javaprograms;

import java.util.*;

public class SecondHighestSalary {

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

            System.out.println("Enter the salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();

            employee6s.add(new Employee6(id , name, department, salary));
        }

        Optional<Employee6> secondHighest = employee6s.stream()
                .sorted(Comparator.comparingInt(Employee6::getSalary).reversed())
                .skip(1)
                .findFirst();

        if (secondHighest.isPresent()){
            System.out.println("Second Highest Salary Employee:" + secondHighest.get().getName());
            System.out.println("Salary:" + secondHighest.get().getSalary());
        }else {
            System.out.println("Second highest employee does not exist.");
        }
        scanner.close();
    }
}
