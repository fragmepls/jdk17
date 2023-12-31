package assignment9;

import java.util.List;

public class Student {

    private String name;
    private int id;
    private List<Course> courses;

    public Student(String name, int id, List<Course> courses) {
        this.name = name;
        this.id = id;
        this.courses = courses;
        System.out.println("Student created");
    }

    public void printStudent() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Courses: " + courses);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
