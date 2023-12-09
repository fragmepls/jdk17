package assignment7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomWords {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No words");
            return;
        }

        String originalSentence = String.join(" ", args);
        List<String> words = Arrays.asList(args);

        while (true) {
            Collections.shuffle(words);
            String randomSentence = String.join(" ", words);
            System.out.println(randomSentence);

            if (randomSentence.equals(originalSentence)) {
                System.out.println("Original sentence");
                break;
            }
        }
    }
}
