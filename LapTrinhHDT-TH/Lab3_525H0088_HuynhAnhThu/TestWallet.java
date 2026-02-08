public class TestWallet {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet("ID001", 1000.0, false);
        
        System.out.println(wallet1.toString());

        wallet1.deposit(500.0);
        System.out.println("After deposit 500: " + wallet1.getBalance());

        wallet1.withdraw(200.0);
        System.out.println("After withdraw 200: " + wallet1.getBalance());

        wallet1.lock();
        System.out.println("Wallet is now locked.");

        wallet1.deposit(100.0);
        wallet1.withdraw(100.0);
        System.out.println("Balance after attempted transaction while locked: " + wallet1.getBalance());

        wallet1.unlock();
        System.out.println("Wallet is now unlocked.");

        wallet1.withdraw(2000.0);
        System.out.println("Balance after attempted overdraft: " + wallet1.getBalance());

        System.out.println(wallet1.toString());
    }
}