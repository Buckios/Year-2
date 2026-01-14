import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int fiboloop = fiboloop(n);
        int fiborecursion = fiborecursion(n);
        System.out.println("Fibonacci number (Loop) of " + n + " is: " + fiboloop);
        System.out.println("Fibonacci number (Recursion) of " + n + " is: " + fiborecursion);
    sc.close();
    }
    public static int fiboloop(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        
        int a = 0, b = 1, fibo = 1;
        for (int i = 2; i <= n; i++) {
            fibo = a + b;
            a = b;
            b = fibo;
        }
        return fibo;
    }
    public static int fiborecursion(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fiborecursion(n - 1) + fiborecursion(n - 2);
    }
}
