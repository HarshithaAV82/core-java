package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllMatchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the no of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            numbers.add(scanner.nextInt());
        }

        boolean result = numbers.stream()
                .allMatch(number -> number > 0);

        if (result){
            System.out.println("All numbers are positive");
        }else {
            System.out.println("Not All numbers are positive");
        }

        scanner.close();
    }
}
