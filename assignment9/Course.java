package assignment9;

public class Course {

    private String name;
    private int credits;
    private String examType;
    private int hoursPerWeek;
    private Teacher teacher;

    public Course(String name, int credits, String examType, int hoursPerWeek, Teacher teacher) {
        this.name = name;
        this.credits = credits;
        this.examType = examType;
        this.hoursPerWeek = hoursPerWeek;
        this.teacher = teacher;
        System.out.println("Course created");
    }

    public void printCourse() {
        System.out.println("Name: " + name);
        System.out.println("Credits: " + credits);
        System.out.println("Exam type: " + examType);
        System.out.println("Hours per week: " + hoursPerWeek);
        System.out.println("Teacher: " + teacher.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
