import java.math.BigDecimal;

public class BigDecimalMax {

    public static void main(String[] args) {
        BigDecimal[] numbers = {
            new BigDecimal("120.55"),
            new BigDecimal("89.99"),
            new BigDecimal("500.25"),
            new BigDecimal("500.24"), 
            new BigDecimal("5.0")
        };

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