package assignment4;

public class Main {

    public static void main(String[] args) {
        if (args.length == 2) {
            Table.printTable(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } else {
            throw new IllegalArgumentException("Invalid number of arguments.");
        }
    }
}
