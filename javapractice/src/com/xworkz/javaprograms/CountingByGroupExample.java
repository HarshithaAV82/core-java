package com.xworkz.javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountingByGroupExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> subjects = new ArrayList<>();

        System.out.println("Enter number of subjects:");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter subjects:");
        for (int i = 0; i < n; i++){
            subjects.add(scanner.nextLine());
        }

        Map<String, Long> res = subjects.stream()
                .collect(Collectors.groupingBy(
                        subject -> subject,
                        Collectors.counting()
                ));

        System.out.println("Subject count:" + res);

        scanner.close();
    }
}
