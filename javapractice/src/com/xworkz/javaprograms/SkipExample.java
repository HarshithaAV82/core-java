package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkipExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            num.add(scanner.nextInt());
        }

        System.out.println("After Skipping First 2 Elements:");
        num.stream()
                .skip(2)
                .forEach(number -> System.out.println(number));
        scanner.close();
    }
}
