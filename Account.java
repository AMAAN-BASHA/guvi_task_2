import java.util.Scanner;
public class Account {//program for deposit and withdraw the amount and display the balance
    private double balance;
        public Account() {
        this.balance = 0.0;
    }
        public Account(double initialBalance) {
        this.balance = initialBalance;
    }
        public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }


    public void displayBalance() {
        System.out.printf("Balance: %.2f\n", balance);
    }

    public static void main(String[] args) {

        Account account1 = new Account();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        account1.deposit(scanner.nextDouble());
        System.out.println("Enter the amount to be withdrawed");
        account1.withdraw(scanner.nextDouble());
        account1.displayBalance();
    }
}
