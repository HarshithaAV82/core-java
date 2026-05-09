package com.xworkz.pratice;

public class Runner {

    public static void main(String[] args) {

        StackExample stackExample = new StackExample();

        stackExample.push(10);
        stackExample.push(20);
        stackExample.push(30);

        stackExample.display();

        stackExample.pop();
        stackExample.pop();
        stackExample.pop();

        stackExample.display();
    }
}
