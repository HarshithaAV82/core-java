package com.xworkz.task;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true){
            System.out.println("1.Add task");
            System.out.println("2. view Tasks");
            System.out.println("3. Exit");

            System.out.println("Enter choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1){
                System.out.println("Enter task: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added!..");
            } else if (choice == 2) {
             if (tasks.size() == 0){
                 System.out.println("No tasks...");
             }else {
                 for (int i = 0; i < tasks.size(); i++){
                     System.out.println(i + "." + tasks.get(i));
                 }
             }
            } else if (choice == 3) {
                System.out.println("End....");
                break;
            }
            else {
                System.out.println("Invalid choice...");
            }
        }
    }
}
