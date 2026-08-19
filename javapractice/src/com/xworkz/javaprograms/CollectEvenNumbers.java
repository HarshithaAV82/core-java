package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            num.add(scanner.nextInt());
        }

        List<Integer> evenNumbers = num.stream()
                .filter(number-> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers:" + evenNumbers);

        scanner.close();
    }
}
