package assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

    List<Integer> numbers = new ArrayList<>(6);

    public static void main(String[] args) throws InterruptedException {
        Lotto lotto = new Lotto();
        lotto.runMe();
    }

    public void runMe() throws InterruptedException {
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int rand = r.nextInt(90) + 1;
            if (numbers.contains(rand)) {
                while (numbers.contains(rand)) {
                    rand = r.nextInt(90) + 1;
                }
            } else {
                numbers.add(rand);
            }
            System.out.print(rand + " ");
            Thread.sleep(2000);
        }
        int jolly = r.nextInt(90) + 1;
        System.out.print("--- " + jolly);
    }

}
