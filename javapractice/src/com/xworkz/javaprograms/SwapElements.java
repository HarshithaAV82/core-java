package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwapElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
        list.add(scanner.nextInt());
        }

        System.out.println("Before Swapping: " + list);
        System.out.println("Enter first index:");
        int index1 = scanner.nextInt();

        System.out.println("Enter second index:");
        int index2 = scanner.nextInt();

        Collections.swap(list, index1, index2);

        System.out.println("After Swapping: " + list);

        scanner.close();
    }
}

