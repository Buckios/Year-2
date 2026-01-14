package Lab1_525H0088_HuynhAnhThu;

import java.util.Scanner;

public class SumFirstnLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int firstDigit = number;
        
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        
        return firstDigit + lastDigit;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        while (true) {
            System.out.print("Enter a positive integer: ");
            number = sc.nextInt();  
            if (number > 0) {
                break;
            }
        }
        System.out.println("Sum of first and last digit: " + sumFirstAndLastDigit(number));

        sc.close();
    }
    
}
