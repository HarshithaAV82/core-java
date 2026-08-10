package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i ++){
            list.add(scanner.nextInt());
        }

        System.out.println("Even Numbers:");

        list.stream().filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println(num));

        scanner.close();
    }
}
