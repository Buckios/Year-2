import java.util.Scanner;

public class TheAccumulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input;
        System.out.println("Enter a number to accumulate (0 to stop): ");
        do {
            System.out.print("Enter: ");
            input = sc.nextInt();
            sum += input;
            if (input != 0) {
                System.out.println("Current total: " + sum);
            }
        } while (input != 0);
    
        System.out.println("Final: " + sum);
        sc.close();
    }
}