package com.xworkz.pratice;

public class StackExample {

    int top = -1;
    int size = 5;

    int[] stack = new int[size];

    void push(int value) {

        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + "inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            System.out.println(stack[top] + "removed");
            top--;
        }
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }


}