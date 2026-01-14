import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int number = sc.nextInt();
        int sum = 0;
        if (number < 0) {
            number = -number;
        }
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}