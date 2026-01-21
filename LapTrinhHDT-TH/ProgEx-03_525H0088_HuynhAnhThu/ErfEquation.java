import java.util.Scanner;
import java.text.DecimalFormat;

public class ErfEquation {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        double sum = 0;
        double factorial = 1;
        double xPower = x;
        double sign = 1.0;

        for (int n = 0; n < 20; n++) {
            double term = (sign * xPower) / (factorial * (2 * n + 1));
            sum += term;

            xPower *= x * x;
            factorial *= (n + 1);
            sign *= -1;
        }

        sc.close();
        double result = (2 / Math.sqrt(Math.PI)) * sum;
        System.out.println("erf(" + x + ") = " + df.format(result));
    }
}