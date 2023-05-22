import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class ques21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student's name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        // Get student's grade
        System.out.print("Enter student's grade: ");
        int grade = scanner.nextInt();

        // Create a new student object
        Student student = new Student(name, grade);

        // Add courses
        System.out.println("Enter courses (press 'q' to quit):");
        scanner.nextLine(); // Consume the newline character
        String course;
        do {
            course = scanner.nextLine();
            if (!course.equalsIgnoreCase("q")) {
                student.addCourse(course);
            }
        } while (!course.equalsIgnoreCase("q"));

        // Display student information and courses
        System.out.println();
        student.displayInfo();
        student.displayCourses();

        // Remove a course
        System.out.print("Enter a course to remove: ");
        String courseToRemove = scanner.nextLine();
        student.removeCourse(courseToRemove);

        // Display updated courses
        System.out.println();
        student.displayCourses();

        scanner.close();
    }
}

