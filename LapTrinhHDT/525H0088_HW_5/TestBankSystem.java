public class TestBankSystem {
    public static void main(String[] args) {
        BankSystem bank1 = new BankSystem("ACC123456", "Alice Smith", 5000.0);

        System.out.println(bank1.toString());

        bank1.deposit(1000.0);
        System.out.println("Balance after deposit: " + bank1.getBalance());

        bank1.deposit(500.0, "Salary Deposit");
        System.out.println("Balance after deposit with note: " + bank1.getBalance());

        bank1.setOwnerName("Alice Jones");
        System.out.println("Updated Owner Name: " + bank1.getOwnerName());

        System.out.println(bank1.toString());
    }
}