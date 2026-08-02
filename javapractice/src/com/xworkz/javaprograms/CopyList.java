package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CopyList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> source = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++){
            source.add(scanner.nextLine());
        }

        List<String> destination = new ArrayList<>();

        for (int i = 0; i < size; i++){
            destination.add("");
        }

        Collections.copy(destination,source);

        System.out.println("Source List:" + source);
        System.out.println("Destination List:" + destination);

        scanner.close();
    }
}
