package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        System.out.println("Sorted list:" + list);

        System.out.println("Enter the element to search:");
        int search = scanner.nextInt();

        int index = Collections.binarySearch(list, search);

        if (index >= 0){
            System.out.println("Enter Found at Index:" + index);
        }else {
            System.out.println("Elements Not Found");
        }
        scanner.close();
    }
}
