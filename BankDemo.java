class Bank {
    private int accountNumber;
    private String name;
    private int balanceAmount;

    public Bank(int accountNumber, String name, int balanceAmount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balanceAmount = balanceAmount;
    }

    public void withdraw(int amount) {
        if (amount > balanceAmount) {
            System.out.println("Withdrawal failed: Insufficient balance");
        } else {
            balanceAmount -= amount;
           
        }
    }

    public void displayBalance() {
        System.out.println(accountNumber + " " + name + " " + balanceAmount);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        String[] input1 = {"", "", "", ""};
        Bank bank1 = new Bank(Integer.parseInt(input1[0]), input1[1], Integer.parseInt(input1[2]));
        bank1.withdraw(Integer.parseInt(input1[3]));
        bank1.displayBalance();

        String[] input2 = {"302", "Agarwal", "2200", "200"};
        Bank bank2 = new Bank(Integer.parseInt(input2[0]), input2[1], Integer.parseInt(input2[2]));
        bank2.withdraw(Integer.parseInt(input2[3]));
        bank2.displayBalance();
    }
}
