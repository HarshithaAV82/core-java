package com.xworkz.collections;

import javax.swing.*;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(100,"java");
        map.put(101, "Spring");
        map.put(102,"SQL");

        System.out.println(map);
    }
}
