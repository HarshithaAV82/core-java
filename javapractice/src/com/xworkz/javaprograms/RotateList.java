package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RotateList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }
        System.out.println("Before Rotation: " + list);

        // Step 6: Read rotation distance
        System.out.println("Enter rotation distance:");
        int distance = scanner.nextInt();

        // Step 7: Rotate the list
        Collections.rotate(list, distance);

        // Step 8: Print the rotated list
        System.out.println("After Rotation: " + list);

        scanner.close();
    }
}
