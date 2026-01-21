import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Big Decimal array:");
        int n = sc.nextInt();
        BigDecimal[] numbers = new BigDecimal[n];
        System.out.println("Enter the values of the Big Decimal:");
        for (int i = 0; i < n; i++) {
            System.out.print("Big Decimal " + (i + 1) + ": ");
            numbers[i] = sc.nextBigDecimal();
        }

        sc.close();

        BigDecimal result = findMax(numbers);
        System.out.println("The maximum value is: " + result);
    }

    public static BigDecimal findMax(BigDecimal[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        BigDecimal max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        
        return max;
    }
}