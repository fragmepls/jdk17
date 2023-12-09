package assignment7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DoorGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nDoors = 10;
        int correctDoor = random.nextInt(nDoors) + 1;
        char[] doors = new char[nDoors];
        Arrays.fill(doors, '*');

        while (true) {
            displayDoors(doors);

            System.out.print("Enter door: ");
            int door = scanner.nextInt();

            if (door == correctDoor) {
                doors[door - 1] = '+';
                displayDoors(doors);
                System.out.println("Correct door");
                break;
            } else {
                doors[door - 1] = 'X';
                System.out.println("Try again");
            }
        }
        scanner.close();
    }

    private static void displayDoors(char[] doors) {
        for (int i = 0; i < doors.length; i++) {
            System.out.print((i + 1) + "\t");
        }
        System.out.println();
        for (char door : doors) {
            System.out.print(door + "\t");
        }
        System.out.println();
    }
}
