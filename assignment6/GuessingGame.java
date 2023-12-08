package assignment6;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 100) + 1;
        int maxGuesses = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        int guess = s.nextInt();
        while (guess != rand && maxGuesses-- > 1) {
            if (guess > rand) {
                System.out.println("Too high");
                System.out.println("Guesses left: " + maxGuesses);
            } else {
                System.out.println("Too low");
                System.out.println("Guesses left: " + maxGuesses);
            }
            guess = s.nextInt();
        }
        if (maxGuesses == 0) {
            System.out.println("You lost!");
        } else {
            System.out.println("You won!");
        }
    }
}
