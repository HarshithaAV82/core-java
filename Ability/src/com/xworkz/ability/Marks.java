package com.xworkz.ability;

import java.util.Scanner;

public class Marks {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks:");
        int marks = scanner.nextInt();
        if(marks >= 35){

            System.out.println("he / she passed the exam:" + "the exam score is " +  marks + " " +"marks");
        }
        else if(marks < 35){
            System.out.println("he / she failed the exam");
        }
        else {
            System.out.println("the result is not announced");
        }

    }

}
