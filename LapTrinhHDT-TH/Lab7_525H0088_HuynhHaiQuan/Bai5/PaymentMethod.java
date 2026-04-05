public abstract class PaymentMethod {
    protected double balance;

    public PaymentMethod(double balance) {
        this.balance = balance;
    }

    public abstract boolean processPayment(double amount);

    public abstract String getPaymentDetails();

    public double getBalance() {
        return balance;
    }
}