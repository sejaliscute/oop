import java.util.*;
// Define the Account interface
interface Account {
    void set(String name, int accountNumber, double balance);
    void display();
}

// Define the Person interface
interface Person1 {
    void store(String name);
    void disp();
}

// Implement the Customer class that extends Person and implements Account
class Customer implements Person1, Account {
    private String name;
    private int accountNumber;
    private double balance;

    @Override
    public void set(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Person Information:");
        System.out.println("Name: " + name);
    }

    // Calculate and display interest
    public void calculateInterest(double interestRate) {
        double interest = balance * interestRate;
        System.out.println("Interest: $" + interest);
    }
}

// Main class
public class ques19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();

        // Create Customer object and set values
        Customer customer = new Customer();
        customer.store(name);
        customer.set(name, accountNumber, balance);

        // Display information and calculate interest
        customer.disp();
        customer.display();
        customer.calculateInterest(interestRate);

        scanner.close();
    }
}
