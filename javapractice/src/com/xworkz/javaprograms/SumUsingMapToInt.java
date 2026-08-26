package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumUsingMapToInt {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            num.add(sc.nextInt());
        }

        int sum = num.stream()
                .mapToInt(number -> number)
                .sum();

        System.out.println("Sum:" + sum);

        sc.close();
    }
}
