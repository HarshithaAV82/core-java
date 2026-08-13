package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplyNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            numbers.add(scanner.nextInt());
        }

        System.out.println("Numbers after multiplying by 2:");
        numbers.stream()
                .map(number -> number * 2)
                .forEach(number -> System.out.println(number));

        scanner.close();
    }
}
