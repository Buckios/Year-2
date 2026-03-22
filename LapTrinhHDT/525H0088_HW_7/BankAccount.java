public class BankAccount {
    protected String accountNumber;
    protected String ownerName;
    protected double balance;

    public BankAccount() {
        this.accountNumber = "";
        this.ownerName = "";
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public BankAccount(BankAccount copy) {
        this.accountNumber = copy.accountNumber;
        this.ownerName = copy.ownerName;
        this.balance = copy.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double calculateInterest() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}