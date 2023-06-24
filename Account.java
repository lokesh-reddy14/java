import java.util.Scanner;

public class Account {
    private double balance;

    public void startAccount() {
        System.out.println("Welcome to your new account!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the initial balance: ");
        balance = scanner.nextDouble();
        System.out.println("Your account is ready with a balance of " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " has been deposited into your account. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " has been withdrawn from your account. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Current balance: " + balance);
        }
    }

    public void getBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.startAccount();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Get Balance");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.getBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our service!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
