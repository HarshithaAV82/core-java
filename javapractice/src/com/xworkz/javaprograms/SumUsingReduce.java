package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumUsingReduce {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            num.add(scanner.nextInt());
        }

        int sum = num.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Sum:" + sum);

        scanner.close();
    }
}
