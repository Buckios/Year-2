public class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount() {
        super();
        this.transactionFee = 0.0;
    }

    public CheckingAccount(String accountNumber, String ownerName, double balance, double transactionFee) {
        super(accountNumber, ownerName, balance);
        this.transactionFee = transactionFee;
    }

    public CheckingAccount(CheckingAccount copy) {
        super(copy);
        this.transactionFee = copy.transactionFee;
    }

    @Override
    public void withdraw(double amount) {
        double totalDeduction = amount + transactionFee;
        if (amount > 0 && balance >= totalDeduction) {
            balance -= totalDeduction;
        }
    }
}