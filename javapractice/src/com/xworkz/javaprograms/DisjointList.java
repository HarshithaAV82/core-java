package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DisjointList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println("Enter size of first list:");
        int size1 = scanner.nextInt();

        System.out.println("Enter first list elements:");
        for (int i = 0; i < size1; i++){
            list1.add(scanner.nextInt());
        }

        System.out.println("Enter size of second list:");
        int size2 = scanner.nextInt();

        System.out.println("Enter second list elements:");
        for (int i = 0; i < size2; i++){
            list2.add(scanner.nextInt());
        }

        System.out.println("First List : " + list1);
        System.out.println("Secomd List :" + list2);

        boolean result = Collections.disjoint(list1, list2);

        if (result){
            System.out.println("Both Lists are Disjoint");
        }else {
            System.out.println("Both Lists are not Disjoint");
        }
        scanner.close();
    }
}
