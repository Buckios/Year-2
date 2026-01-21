import java.util.Scanner;
import java.text.DecimalFormat;

public class SinEquation {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        double x = sc.nextDouble();

        double sinX = 0;
        double term = x;
        
        for (int n = 1; n <= 15; n++) {
            sinX += term;
            term = -term * x * x / ((2 * n) * (2 * n + 1));
        }
        sc.close();
        System.out.printf("Approximated sin " + df.format(x) + " = " + df.format(sinX) + "\n");
    }
}