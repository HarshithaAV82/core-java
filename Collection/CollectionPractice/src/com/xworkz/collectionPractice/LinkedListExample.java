package com.xworkz.collectionPractice;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Spring");
        list.add("SQL");

        list.addFirst("HTML");
        list.addLast("Hibernate");

        System.out.println(list);

        System.out.println("First Element:" + list.getFirst());
        System.out.println("Second Elemnet:" + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("After Remove:" + list);
    }
}
