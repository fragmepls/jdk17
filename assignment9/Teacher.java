package assignment9;

import java.util.List;

public class Teacher {

    private String name;
    private String address;
    private int id;
    private List<Course> courses;

    public Teacher(String name, String address, int id, List<Course> courses) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.courses = courses;
        System.out.println("Teacher created");
    }

    public Teacher(String name, String address, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
        System.out.println("Teacher created");
    }

    public void printTeacher() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("ID: " + id);
        System.out.println("Courses: " + courses);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
