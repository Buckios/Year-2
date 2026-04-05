public class PaymentProcessor {
    public static void main(String[] args) {
        PaymentMethod paypal = new PayPalPayment("customer@email.com", 200.0);
        Transaction ts1 = new Transaction(paypal, 100.0);
        
        System.out.println("Payment Method: " + ts1.getPaymentDetails());
        ts1.execute();
        System.out.println("Amount: " + ts1.getAmount() + "$");
        System.out.println("Balance after payment: " + ts1.getBalance());
        ts1.issueRefund();
        System.out.println("Refund attempt unsucessful. Paypal does not support refund.");
        System.out.println("Balance after refund attempt: " + ts1.getBalance());
        
        PaymentMethod creditCard = new CreditCardPayment("1234-5678-9876-5432", "Huynh Hai Quan", 100.0);
        Transaction ts2 = new Transaction(creditCard, 70.0);
        
        System.out.println("Payment Method: " + ts2.getPaymentDetails());
        ts2.execute();
        System.out.println("Amount: " + ts2.getAmount() + "$");
        System.out.println("Balance after payment: " + ts2.getBalance());
        ts2.issueRefund();
        System.out.println("Refund completed.");
        System.out.println("Balance after refund: " + ts2.getBalance());
    }
}