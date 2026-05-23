package com.xworkz.interview;

public class Result {

    int score;

    Result(int score){
        this.score=score;
    }

    void display(){

        if(score>=7){
            System.out.println("Good Performance");
        }
        else{
            System.out.println("Need Improvement");
        }
    }
}