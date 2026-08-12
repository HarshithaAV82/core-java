package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertToUppercase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++){
            names.add(scanner.nextLine());
        }

        System.out.println("Uppercase Names:");
        names.stream()
                .map(name ->name.toUpperCase())
                .forEach(name-> System.out.println(name));
        scanner.close();
    }
}
