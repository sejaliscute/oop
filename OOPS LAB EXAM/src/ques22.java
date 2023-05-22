import java.util.Scanner;

class Person2 {
    private String firstName;
    private String lastName;

    public Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee1 extends Person2 {
    private String employeeId;
    private String jobTitle;

    public Employee1(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class ques22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get person's information
        System.out.print("Enter person's first name: ");
        String personFirstName = scanner.nextLine();

        System.out.print("Enter person's last name: ");
        String personLastName = scanner.nextLine();

        // Create Person object
        Person2 person = new Person2(personFirstName, personLastName);

        // Get employee's information
        System.out.print("Enter employee's first name: ");
        String employeeFirstName = scanner.nextLine();

        System.out.print("Enter employee's last name: ");
        String employeeLastName = scanner.nextLine();

        System.out.print("Enter employee's ID: ");
        String employeeId = scanner.nextLine();

        System.out.print("Enter employee's job title: ");
        String jobTitle = scanner.nextLine();

        // Create Employee object
        Employee1 employee = new Employee1(employeeFirstName, employeeLastName, employeeId, jobTitle);

        // Display person's information
        System.out.println("\nPerson:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        // Display employee's information
        System.out.println("\nEmployee:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());

        scanner.close();
    }
}

