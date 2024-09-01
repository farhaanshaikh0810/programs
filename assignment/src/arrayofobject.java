import java.util.ArrayList;

class Student {
    // Properties of the Student class
    String name;
    int age;
    String grade;

    // Constructor to initialize the object
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class arrayofobject {
    public static void main(String[] args) {
        // Create a list to store Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("john", 20, "A"));
        students.add(new Student("Bob", 22, "B"));
        students.add(new Student("juli", 19, "A"));

        for (Student student : students) {
            student.printStudentDetails();
            System.out.println();
        }
    }
}

