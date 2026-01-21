import java.text.DecimalFormat;

public class DiscountAndTax {
    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$#,##0.00");
        DecimalFormat dr = new DecimalFormat("0%");

        double originalPrice = 79.99;
        double discountRate = 0.15; 
        double taxRate = 0.07;

        double discountAmount = originalPrice * discountRate;
        double discountedPrice = originalPrice - discountAmount;
        double taxAmount = discountedPrice * taxRate;
        double finalPrice = discountedPrice + taxAmount;

        System.out.println("Original Price: " + fp.format(originalPrice));
        System.out.println("Discount Rate: " + dr.format(discountRate));
        System.out.println("Tax Rate: " + dr.format(taxRate));
        System.out.println("Price after discount and tax: " + fp.format(finalPrice));
    }
    
}
