package assignment9;

import java.util.Scanner;

public class SentenceTokens {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = s.nextLine();
        String[] tokens = sentence.split(" ");
        String longest = "";
        for (String token : tokens) {
            if (token.length() > longest.length()) {
                longest = token;
            }
        }
        System.out.println("Longest token: " + longest + " " + longest.length() + " chars");
        for (String token : tokens) {
            int count = 0;
            for (String string : tokens) {
                if (token.equals(string)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Token " + token + " occurs " + count + " times");
            }
        }
        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.print(tokens[i] + " ");
        }
        System.out.println();
        for (String token : tokens) {
            for (int i = token.length() - 1; i >= 0; i--) {
                System.out.print(token.charAt(i));
            }
            System.out.print(" ");
        }
        s.close();
    }

}
