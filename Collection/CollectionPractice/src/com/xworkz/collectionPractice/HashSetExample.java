package com.xworkz.collectionPractice;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);

        set.forEach(data -> System.out.println(data));
        System.out.println(set);
    }
}
