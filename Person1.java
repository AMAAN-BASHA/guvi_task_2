import java.util.Scanner;
public class Person1 {//program for display the Employee's name, age, employeeID, salary
    static Scanner scanner = new Scanner(System.in);
    String name;
    int age;

    public Person1(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person1{
    String employeeID;
    double salary;

    public Employee(String name, int age, String employeeID, double salary) {
        super(name,age);
        this.employeeID = employeeID;
        this.salary = salary;

    }
    public void displayEmployeeInfo(){
        System.out.print("Name: " + name + ", Age: " + age + ", Employee ID: " + employeeID + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        System.out.println("Enter the Employee's name, age, employeeID, salary : ");
        Employee emp = new Employee(scanner.nextLine(), scanner.nextInt(), scanner.next(), scanner.nextDouble());
        emp.displayEmployeeInfo();
    }
}


