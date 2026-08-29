package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinUsingMapToInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements:");
        int n = scanner.nextInt();

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++){
            num.add(scanner.nextInt());
        }

       int min =  num.stream()
                .mapToInt(number -> number)
                .min()
                .orElse(0);

        System.out.println("Maximum number:" + min);
        scanner.close();

    }
}
