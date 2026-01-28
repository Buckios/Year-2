public class BankSystem {
    private String bankAccount;
    private String ownerName;
    private double balance;

    public BankSystem() {
    }

    public BankSystem(String bankAccount, String ownerName, double balance) {
        this.bankAccount = bankAccount;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(double amount, String note) {
        this.balance += amount;
        System.out.println(note);
    }

    public String toString() {
        return "BankSystem[bankAccount=" + bankAccount + ", ownerName=" + ownerName + ", balance=" + balance + "]";
    }
}