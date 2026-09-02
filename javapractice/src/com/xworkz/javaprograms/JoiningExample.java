package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JoiningExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        System.out.println("Enter the no of elements:");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the names");
        for (int i = 0; i < n; i++){
            names.add(scanner.nextLine());
        }

        String result = names.stream()
                .collect(Collectors.joining(","));

        System.out.println("Joining names:" + result);

        scanner.close();
    }
}
