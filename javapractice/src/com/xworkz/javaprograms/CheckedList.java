package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CheckedList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++){
            list.add(scanner.nextLine());
        }

        List<String> checkedList = Collections.checkedList(list, String.class);

        System.out.println("Checked List:" + checkedList);

        System.out.println("Enter another element:");
        String value = scanner.nextLine();

        checkedList.add(value);

        System.out.println("After Adding:" + checkedList);

        scanner.close();
    }
}
