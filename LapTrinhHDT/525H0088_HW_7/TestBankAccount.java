public class TestBankAccount {
    public static void main(String[] args) {
        SavingAccount savingAcc = new SavingAccount("SA-1001", "Nguyen Van A", 50000.0, 0.05);
        CheckingAccount checkingAcc = new CheckingAccount("CA-2002", "Tran Thi B", 30000.0, 2.0);

        System.out.println("Saving Account:");
        savingAcc.deposit(15000.0);
        savingAcc.withdraw(20000.0);
        System.out.println("Interest: " + savingAcc.calculateInterest());
        savingAcc.displayInfo();

        System.out.println("\nChecking Account:");
        checkingAcc.deposit(5000.0);
        checkingAcc.withdraw(10000.0);
        System.out.println("Interest: " + checkingAcc.calculateInterest());
        checkingAcc.displayInfo();
    }
}