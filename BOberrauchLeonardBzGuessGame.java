import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BOberrauchLeonardBzGuessGame {

    private final Set<String> codeSet = Set.of("a", "b", "c", "d", "e", "f");

    public static void main(String[] args) {
        BOberrauchLeonardBzGuessGame game = new BOberrauchLeonardBzGuessGame();
        printIntroduction();
        game.startGame();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String code = generateCode();
        int attempts = 20;
        List<String> history = new ArrayList<>();
        while (!input.equals("quit") && !input.equals(code) && attempts != 0) {
            System.out.print(attempts + ">");
            input = scanner.nextLine();
            switch (input) {
                case "new":
                    code = generateCode();
                    attempts = 20;
                    break;
                case "help":
                    printIntroduction();
                    break;
                case "buy":
                    attempts -= 5;
                    char letter = code.charAt((int) (Math.random() * 3));
                    for (int i = 0; i < code.length(); i++) {
                        if (code.charAt(i) == letter) {
                            System.out.print(letter);
                            letter = 'x';
                        } else {
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                    break;
                case "h":
                    if (history.isEmpty()) {
                        System.out.println("No history");
                        break;
                    } else {
                        for (String s : history) {
                            System.out.println(s);
                        }
                    }
                    break;
                case "r", "quit":
                    System.out.println(code);
                    break;
                case "p":
                    System.out.print("Enter code: ");
                    code = scanner.nextLine();
                    break;
                default:
                    history.add(input);
                    if (input.length() != 4) {
                        System.out.println("Invalid input");
                        break;
                    }
                    for (int i = 0; i < code.length(); i++) {
                        if (code.charAt(i) == input.charAt(i)) {
                            System.out.print("X");
                        } else if (code.contains(input.charAt(i) + "")) {
                            System.out.print("-");
                        } else {
                            System.out.print("");
                        }
                    }
                    System.out.println();
                    attempts--;
                    break;
            }
        }
        if (input.equals(code))
            System.out.println("You won!");
        else if (attempts == 0)
            System.out.println("You lost!");
    }

    public static void printIntroduction() {
        System.out.println("Welcome to the Guessing Game");
        System.out.println("List of available commands: ");
        System.out.println("new - start a new game");
        System.out.println("help - Display a help screen explaining the game rules and game commands");
        System.out.println("buy - Buy one letter of the secret code at its right position (decreases attempts by 5!)");
        System.out.println("h - Show history of all guesses and evaluations");
        System.out.println("r - Reveal the ‘secret code’ and continue (for debug purposes only)");
        System.out.println("p - Preset the ‘secret code’ with the next input (for debug purposes only)");
        System.out.println("quit - Reveal the solution and quit the game");
        System.out.println("Programmed by Leonard Oberrauch");
    }

    public String generateCode() {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            code.append(codeSet.toArray()[(int) (Math.random() * codeSet.size())]);
        }
        return code.toString();
    }

}
