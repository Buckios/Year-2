package Lab1_525H0088_HuynhAnhThu;

import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Number of digits: " + countDigits(number));

        sc.close();     
    }
}