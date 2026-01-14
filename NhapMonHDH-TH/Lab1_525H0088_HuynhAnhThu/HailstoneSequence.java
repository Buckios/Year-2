package Lab1_525H0088_HuynhAnhThu;

import java.util.Scanner;

public class HailstoneSequence {
    public static void printHailstoneSequence (int n) {
        while (n != 1) {
            if (n % 2 == 0) {
                int next = n / 2;
                System.out.println(n + " is even, so we take n/2: " + next);
                n = next;
            } else {
                int next = (n * 3) + 1;
                System.out.println(n + " is odd, so we take 3*n + 1: " + next);
                n = next;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter a positive integer: ");
            n = sc.nextInt();
            if (n > 0) {
                break;
            }
        }
        printHailstoneSequence(n);
        sc.close();
    }
}
