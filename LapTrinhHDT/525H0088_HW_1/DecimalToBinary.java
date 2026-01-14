import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        System.out.print("Decimal " + n + " in binary is: ");
        String result = "";

        if (n == 0) {
            result = "0";
        } 

        while (n > 0) {
            int remainder = n % 2;
            result = remainder + result;
            n = n / 2;
        }
        System.out.println(result);
        sc.close();
    }
    
}
