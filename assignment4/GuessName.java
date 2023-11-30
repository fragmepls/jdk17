package assignment4;

import java.util.Scanner;

public class GuessName {

    public static final int maxGuesses = 3;
    public static final String name = "test";
    public boolean guessed = false;
    public int guesses = 0;

    public static void main(String[] args) {
        GuessName guessName = new GuessName();
        guessName.runMe();
    }

    public void runMe() {
        Scanner s = new Scanner(System.in);
        while (!guessed && guesses < maxGuesses) {
            System.out.print("Enter guess: ");
            String guess = s.nextLine();
            if (guess.equals(name)) {
                System.out.println("You guessed correctly!");
                guessed = true;
            } else {
                System.out.println("You guessed incorrectly.");
                guesses++;
            }
        }
        if (guesses == maxGuesses)
            System.out.println("Maximum guesses reached.");
        s.close();
    }
}
