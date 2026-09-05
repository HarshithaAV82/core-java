package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectToMap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee2> employee2s = new ArrayList<>();

        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Enter employee ID:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            employee2s.add(new Employee2(id, name));
        }

        Map<Integer, String> result = employee2s.stream()
                .collect(Collectors.toMap(
                        Employee2::getId,
                        Employee2::getName
                ));

        System.out.println("EMployee Map:" + result);

        scanner.close();
    }

}
