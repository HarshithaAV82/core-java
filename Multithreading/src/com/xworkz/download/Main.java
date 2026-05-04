package com.xworkz.download;

public class Main {

    public static void main(String[] args) {
        QuizQuestion question1 = new QuizQuestion("Java is?", "Programming language", "Operating System", "Browser", "Database", 1);

        QuizQuestion question2 = new QuizQuestion("Which is an OOP concept?", "Loop", "Inheritance", "Variable", "Operator", 2);

        int totalScore = 0;

        if(question1.displayQuestionAndCheckAnswer()){
            System.out.println("Correct Answer!");
            totalScore++;
        }else{
            System.out.println("Wrong answer!");
        }

        if (question2.displayQuestionAndCheckAnswer()){
            System.out.println("correct answer!");
            totalScore++;
        }else {
            System.out.println("Wrong answer!");
        }
        System.out.println("final Score:" + totalScore);

    }
}
