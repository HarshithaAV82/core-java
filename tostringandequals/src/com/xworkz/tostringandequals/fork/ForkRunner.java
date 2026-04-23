package com.xworkz.tostringandequals.fork;
public class ForkRunner{
    public static void main(String[] args){
        Fork fork = new Fork(5, "Steel", 50);
        Fork fork1 = new Fork(6, "Plastic", 30);
        Fork fork2 = new Fork(5, "Steel", 50);
        boolean check = fork.equals(fork2);
        System.out.println("check=" + check);
    }
}