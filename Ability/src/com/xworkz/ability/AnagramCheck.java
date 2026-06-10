package com.xworkz.ability;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";


        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not anagram");
        }

    }
}
