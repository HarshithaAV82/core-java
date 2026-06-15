package com.xworkz.collectionPractice;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(103, "Java");
        map.put(101, "Spring");
        map.put(100, "SqL");

        map.forEach((k,v) -> System.out.println("Key:" + k + ", value: " + v));
    }
}
