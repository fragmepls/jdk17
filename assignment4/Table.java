package assignment4;

public class Table {

    static void printTable(int n, int m) {
        if (n <= 0 || m <= 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
