package com.xworkz.download;

import java.util.Scanner;

public class QuizQuestion {

    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private  String optionD;
    private int correctOption;

    public QuizQuestion(String questionText, String optionA, String optionB, String optionC, String optionD, int correctOption) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    public boolean displayQuestionAndCheckAnswer(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + questionText);
        System.out.println("1." + optionA);
        System.out.println("2." + optionB);
        System.out.println("3." + optionC);
        System.out.println("4." + optionD);

        System.out.println("Enter your answer (1-4): ");
        int userSelectedOption = scanner.nextInt();

        return userSelectedOption == correctOption;
    }
}
