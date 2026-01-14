import java.util.Scanner;

public class ScanAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int number = sc.nextInt();
        System.out.print("Reversed: ");
        if (number < 0) {
            System.out.print("-");
            number = -number;
        }
        if (number == 0) {
            System.out.print(0);
        } else {
            while (number > 0) {
                int lastDigit = number % 10;
                System.out.print(lastDigit);
                number /= 10;
            }
        }
        
        System.out.println();
        sc.close();
    }
}