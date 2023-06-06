class Student {
    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
}

public class StudentNames {
    public static void main(String[] args) {
        // Create Student objects with and without names
        Student student1 = new Student();
        Student student2 = new Student("John");
        Student student3 = new Student("Alice");

        // Print the names of the students
        student1.printName();
        student2.printName();
        student3.printName();
    }
}