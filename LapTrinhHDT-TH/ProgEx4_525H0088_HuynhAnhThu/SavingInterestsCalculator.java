import java.util.Scanner;
import java.text.DecimalFormat;

public class SavingInterestsCalculator {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("$#,##0");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualRate = sc.nextDouble();

        double totalAfterOneYear = principal * (1 + annualRate);

        System.out.println("Total amount after one year: " + df.format(totalAfterOneYear));
        sc.close();
    }
    
}
