public class Wallet {
    private String ownerId;
    private double balance;
    private boolean isLocked;

    public Wallet() {
    }

    public Wallet(String ownerId, double balance, boolean isLocked) {
        this.ownerId = ownerId;
        this.balance = balance;
        this.isLocked = isLocked;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public void deposit(double amount) {
        if (!isLocked && amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (!isLocked && amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public void lock() {
        this.isLocked = true;
    }

    public void unlock() {
        this.isLocked = false;
    }

    public String toString() {
        return "Wallet[ownerId=" + ownerId + ", balance=" + balance + ", status=" + isLocked + "]";
    }
}