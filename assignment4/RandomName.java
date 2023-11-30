package assignment4;

import java.util.Random;

public class RandomName {

    String name = "";
    String allowedChars = "abcdefghijklmnopqrstuvwxyzåæø";
    String consonants = "bcdfghjklmnpqrstvwxyz";
    int counter = 0;

    public static void main(String[] args) {
        RandomName rn = new RandomName();
        rn.runMe();
    }

    public void runMe() {
        Random r = new Random();
        int maxLetters = 2 + r.nextInt(10);
        while (name.length() <= maxLetters) {
            char c = allowedChars.charAt(r.nextInt(28) + 1);
            if (counter == 3) {
                while (consonants.contains(Character.toString(c))) {
                    c = allowedChars.charAt(r.nextInt(28) + 1);
                }
                counter = 0;
            }
            if (consonants.contains(Character.toString(c))) {
                counter++;
            }
            name += c;
        }
        System.out.println(name);
    }
}
