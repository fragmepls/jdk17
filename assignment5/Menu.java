package assignment5;

import java.util.Scanner;

public class Menu {
    private static final StringBuilder orderList = new StringBuilder();
    private static double totalCost = 0;

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        System.out.println("Welcome to the Restaurant!");
        System.out.println("1. Appetizer");
        System.out.println("2. Pizza");
        System.out.println("3. Pasta");
        System.out.println("4. Meat");
        System.out.println("5. Dessert");
        System.out.println("6. Purchase");

        int choice = getUserChoice();

        switch (choice) {
            case 1:
                displayMenu("Appetizer", new String[]{"App 1", "App 2", "App 3"}, new double[]{1, 2, 3});
                break;
            case 2:
                displayMenu("Pizza", new String[]{"Pizza 1", "Pizza 2", "Pizza 3"}, new double[]{1, 2, 3});
                break;
            case 3:
                displayMenu("Pasta", new String[]{"Pasta 1", "Pasta 2", "Pasta 3"}, new double[]{1, 2, 3});
                break;
            case 4:
                displayMenu("Meat", new String[]{"Meat 1", "Meat 2", "Meat 3"}, new double[]{1, 2, 3});
                break;
            case 5:
                displayMenu("Dessert", new String[]{"Dessert 1", "Dessert 2", "Dessert 3"}, new double[]{1, 2, 3});
                break;
            case 6:
                completePurchase();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                displayMainMenu();
        }
    }

    private static void displayMenu(String menuName, String[] items, double[] prices) {
        System.out.println(menuName + " Menu");

        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - " + prices[i] + " EU");
        }

        // Allow the user to go back to the main menu
        int goBackIndex = items.length + 1;
        System.out.println(goBackIndex + ". Go back");

        int choice = getUserChoice();

        if (choice >= 1 && choice <= items.length) {
            // Process user's selection and update order
            orderList.append(items[choice - 1]).append(" - ").append(prices[choice - 1]).append(" EU\n");
            totalCost += prices[choice - 1];
            displayMenu(menuName, items, prices);
        } else if (choice == goBackIndex) {
            displayMainMenu();
        } else {
            System.out.println("Invalid choice. Please try again.");
            displayMenu(menuName, items, prices);
        }
    }

    private static void completePurchase() {
        System.out.println("Order Summary:");
        System.out.println(orderList);
        System.out.println("Total Cost: " + totalCost + " EU");
    }

    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
}
