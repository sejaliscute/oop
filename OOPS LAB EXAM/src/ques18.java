import java.util.Scanner;

class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}

class Employee extends Person{
    private String designation;
    private int salary;

    public Employee(String name, int age, String designation, int salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
    public String getDesignation(){
        return designation;
    }

    public int getSalary(){
        return salary;
    }
}
public class ques18{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Employee [] emp = new Employee[5];
         for(int i=0;i<5;i++){
             System.out.println("Enter name: ");
             String name= sc.nextLine();
             System.out.println("Enter age: ");
             int age = sc.nextInt();
             sc.nextLine();
             System.out.println("Enter Designation: ");
             String designation= sc.nextLine();
             System.out.println("Enter salary: ");
             int salary = sc.nextInt();
             sc.nextLine();
             emp[i] = new Employee(name, age, designation, salary);
         }

        for (Employee employees:emp) {
            if (employees.getSalary() > 5000) {
                System.out.println(employees.getName());
            }
        }
    }
}