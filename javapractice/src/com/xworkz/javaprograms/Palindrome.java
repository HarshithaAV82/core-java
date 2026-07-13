package com.xworkz.javaprograms;

import java.util.Scanner;

//public class Palindrome {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        //Read the String
//        System.out.println("Enter a String");
//        String word = scanner.nextLine();
//
//        //Create reverse string
//        String reverse = "";
//
//        //Reverse the string
//        for (int i = word.length()-1; i >= 0; i--){
//            reverse = reverse + word.charAt(i); // reverse.append(word.charAt(i));
//        }
//
//        //Compare original and reverse
//        if (word.equals(reverse)){
//
//            //print result
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a Palindrome");
//        }
//    }
//}

//public class Palindrome {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        //Read the String
//        System.out.println("Enter a string");
//
//        String word = scanner.nextLine();
//
//        //Reverse the String using StringBuilder
//        String reverse = new StringBuilder(word).reverse().toString();
//
//        //compare original string with reversed string
//        if (word.equals(reverse)) {
//
//            //print
//            System.out.println("Palindrome");
//        }
//        else {
//
//            System.out.println("Not a palindrome");
//        }
//    }
//}

public class Palindrome{        //using two pointers

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = scanner.nextLine();

        boolean palindrome = true;

        int left = 0;

        int right = word.length()-1;

        while (left < right){

            if (word.charAt(left) != word.charAt(right)){

                palindrome = false;
                break;
            }

            left++;
            right--;
        }
        if (palindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

}
}
