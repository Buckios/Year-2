public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount() {
        super();
        this.interestRate = 0.0;
    }

    public SavingAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public SavingAccount(SavingAccount copy) {
        super(copy);
        this.interestRate = copy.interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}