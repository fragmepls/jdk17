package assignment9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Leo1", "123 Main St", 1);
        Teacher teacher2 = new Teacher("Leo2", "456 Main St", 2);
        Teacher teacher3 = new Teacher("Leo3", "789 Main St", 3);
        Course course1 = new Course("Java", 10, "CS", 4, teacher1);
        Course course2 = new Course("Python", 20, "CS", 5, teacher2);
        Course course3 = new Course("C++", 30, "CS", 6, teacher3);
        Student student1 = new Student("Leo1", 1, new ArrayList<Course>() {
            {
                add(course1);
            }
        });
        Student student2 = new Student("Leo2", 2, new ArrayList<Course>() {
            {
                add(course2);
            }
        });
        Student student3 = new Student("Leo3", 3, new ArrayList<Course>() {
            {
                add(course3);
            }
        });
        teacher1.setCourses(new ArrayList<Course>() {
            {
                add(course1);
            }
        });
        teacher2.setCourses(new ArrayList<Course>() {
            {
                add(course2);
            }
        });
        teacher3.setCourses(new ArrayList<Course>() {
            {
                add(course3);
            }
        });

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the teacher name: ");
        String name = s.nextLine();
        for (Teacher teacher : new Teacher[]{teacher1, teacher2, teacher3}) {
            if (teacher.getName().equals(name)) {
                for (Course course : teacher.getCourses()) {
                    System.out.println(course.getName());
                }
                break;
            }
        }
        System.out.println("Enter the student name: ");
        name = s.nextLine();
        for (Student student : new Student[]{student1, student2, student3}) {
            if (student.getName().equals(name)) {
                for (Course course : student.getCourses()) {
                    System.out.println(course.getName());
                }
                break;
            }
        }
    }

}
