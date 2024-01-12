package assignment10;

public class Student implements StudentInterface {

    public static void main(String[] args) {
        StudentInterface sInt;
        Student student = new Student();

        sInt = null; // sInt is a reference variable that can point to an object of type StudentInterface
        sInt = student; // sInt is now pointing to an object of type Student
        // student = sInt; // cant do this because student is of type Student and sInt is of type StudentInterface
        // sInt = new StudentInterface(); // cant do this because StudentInterface is an interface and cannot be instantiated
        sInt.someMethodInStudentInterface(); // this is valid because sInt is pointing to an object of type Student

        TAStudent ta;
        PhDStudent phd;
        Student student2;

        //student2 = phd; // cant do this because phd is of type PhDStudent and student2 is of type Student, even though PhDStudent is a subclass of Student
        //student2.display();

        //student2 = (Student) phd; // this is valid because phd is being casted to type Student
        //student2.display();

        //ta = student2; // cant do this because student2 is of type Student and ta is of type TAStudent, even though Student is a superclass of TAStudent
        //ta.display();

        //ta = (TAStudent) student2; // this is valid because student2 is being casted to type TAStudent
        //ta.display();

        //ta = phd; // cant do this because phd is of type PhDStudent and ta is of type TAStudent, even though PhDStudent is a subclass of TAStudent
        //ta.display();
    }

    public void display() {
        System.out.println("I am a regular student");
    }

    @Override
    public void someMethodInStudentInterface() {

    }
}
