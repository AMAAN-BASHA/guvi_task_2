import java.util.Scanner;
public class Person
{
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;
    public Person(String name)
    {
        this.name = name;
        this.age = 18;
    }
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the person name : ");
        Person person = new Person(scanner.nextLine());
        person.displayPersonInfo();

    }
}


