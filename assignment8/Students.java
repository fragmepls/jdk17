package assignment8;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String name = s.nextLine();
        System.out.print("Enter the grade of the student: ");
        int grade = s.nextInt();
        students.put(name, grade);
        System.out.print("Do you want to add another student? (y/n)");
        String answer = s.next();
        while (answer.equals("y")) {
            System.out.print("Enter the name of the student: ");
            name = s.next();
            System.out.print("Enter the grade of the student: ");
            grade = s.nextInt();
            students.put(name, grade);
            System.out.print("Do you want to add another student? (y/n)");
            answer = s.next();
        }
        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Print all students");
            System.out.println("2. Print all grades");
            System.out.println("3. Print all students with grades");
            System.out.println("4. Search for students by name");
            System.out.println("5. Search for students by grade");
            System.out.println("6. Exit Application");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1 -> System.out.println(students.keySet());
                case 2 -> System.out.println(students.values());
                case 3 -> System.out.println(students);
                case 4 -> {
                    System.out.print("Enter the name of the student: ");
                    name = s.next();
                    for (String student : students.keySet()) {
                        if (student.equals(name)) {
                            System.out.println("Grade of " + name + " is " + students.get(name));
                        }
                    }
                }
                case 5 -> {
                    System.out.print("Enter the grade threshold: ");
                    grade = s.nextInt();
                    for (Map.Entry<String, Integer> student : students.entrySet()) {
                        if (student.getValue() >= grade) {
                            System.out.println("Name of student is " + student.getKey() + " with grade " + student.getValue());
                        }
                    }
                }
                case 6 -> System.out.println("Exiting application...");
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
