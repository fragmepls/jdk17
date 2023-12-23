package assignment9;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] result;
        System.out.print("Enter the N: ");
        int n = s.nextInt();
        System.out.print("Enter the M: ");
        int m = s.nextInt();
        System.out.println("Multiplication table:");
        result = new int[n][m];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(j * i + " ");
                result[i - 1][j - 1] = j * i;
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(result));
        System.out.println("Enter the row to modify: ('exit' to exit)");
        String row = s.next();
        while (!row.equalsIgnoreCase("exit")) {
            System.out.println("Enter the column to modify: ('exit' to exit)");
            String column = s.next();
            while (!column.equalsIgnoreCase("exit")) {
                System.out.println("Enter the new value: ('exit' to exit)");
                String value = s.next();
                while (!value.equalsIgnoreCase("exit")) {
                    result[Integer.parseInt(row) - 1][Integer.parseInt(column) - 1] = Integer.parseInt(value);
                    System.out.println(Arrays.deepToString(result));
                    System.out.println("Enter the new value: ('exit' to exit)");
                    value = s.next();
                }
                System.out.println("Enter the column to modify: ('exit' to exit)");
                column = s.next();
            }
            System.out.println("Enter the row to modify: ('exit' to exit)");
            row = s.next();
        }
    }

}
