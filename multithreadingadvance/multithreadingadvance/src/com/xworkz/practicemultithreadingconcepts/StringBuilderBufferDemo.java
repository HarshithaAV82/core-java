package com.xworkz.practicemultithreadingconcepts;

public class StringBuilderBufferDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Java");
        StringBuffer buffer = new StringBuffer("Java");

        builder.append(" Programming");
        buffer.append(" Programming");

        System.out.println("StringBuilder: " + builder);
        System.out.println("StringBuffer: " + buffer);

        System.out.println("Builder class: " + builder.getClass().getSimpleName());
        System.out.println("Buffer class: " + buffer.getClass().getSimpleName());
    }
}