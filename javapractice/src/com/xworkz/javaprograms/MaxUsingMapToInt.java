package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxUsingMapToInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            num.add(scanner.nextInt());
        }

        int max = num.stream()
                .mapToInt(number -> number)
                .max()
                .orElse(0);

        System.out.println("Maximum Number:" + max);

        scanner.close();
    }
}
