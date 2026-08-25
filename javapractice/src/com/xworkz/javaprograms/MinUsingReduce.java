package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinUsingReduce {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            num.add(scanner.nextInt());
        }

        int min = num.stream()
                .reduce(Integer.MAX_VALUE, (a,b) -> a < b ? a : b);

        System.out.println("Minimum Number:" + min);

        scanner.close();
    }
}
