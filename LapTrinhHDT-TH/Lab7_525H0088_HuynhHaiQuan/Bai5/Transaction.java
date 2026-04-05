public class Transaction {
    private PaymentMethod paymentMethod;
    private double amount;

    public Transaction(PaymentMethod paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public boolean execute() {
        return paymentMethod.processPayment(amount);
    }

    public boolean issueRefund() {
        if (paymentMethod instanceof Refundable) {
            Refundable refundable = (Refundable) paymentMethod;
            return refundable.refund(amount);
        }
        return false;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentDetails() {
        return paymentMethod.getPaymentDetails();
    }

    public double getBalance() {
        return paymentMethod.getBalance();
    }
}