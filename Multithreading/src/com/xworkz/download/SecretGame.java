package com.xworkz.download;
import java.util.Scanner;
public class SecretGame {

        private int secretNumber = 7;

        public void startGame() {
            Scanner scanner = new Scanner(System.in);
            int userGuess;

            System.out.println("Guess the number between 1 and 10");

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();

                if (userGuess > secretNumber) {
                    System.out.println("Too high!");
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Correct! You guessed it 🎉");
                }

            } while (userGuess != secretNumber);
        }

}
