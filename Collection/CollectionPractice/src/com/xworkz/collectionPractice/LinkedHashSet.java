package com.xworkz.collectionPractice;


import java.util.Set;

public class LinkedHashSet {

    public static void main(String[] args) {

        Set<Integer> set = new java.util.LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(40);

        System.out.println(set);

    }

}
