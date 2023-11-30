package assignment3;

public class Main {
    public static void main(String[] args) {
        // Set the number N
        int N = 32;

        // If N is negative, make it positive
        N = Math.abs(N);

        // Print prime numbers up to N
        printPrimesUpToN(N);
    }

    static void printPrimesUpToN(int N) {
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        // If num is less than 2, it's not prime
        if (num < 2) {
            return false;
        }

        // Check for factors up to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
            }
        }
        return true; // num is prime
    }

}
