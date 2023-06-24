import java.util.Scanner;

class Bank {
    private int accountNumber;
    private String name;
    private int balance;

    public Bank(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdrawal(int amount) {
        balance -= amount;
    }

    public void display() {
        System.out.println(accountNumber + " " + name + " " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountNumber = scanner.nextInt();
        String name = scanner.next();
        int balance = scanner.nextInt();
        int withdrawalAmount = scanner.nextInt();
        Bank bank = new Bank(accountNumber, name, balance);
        bank.withdrawal(withdrawalAmount);
        bank.display();
    }
}
