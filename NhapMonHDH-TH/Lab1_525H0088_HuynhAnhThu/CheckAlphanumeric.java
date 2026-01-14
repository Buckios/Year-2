package Lab1_525H0088_HuynhAnhThu;
import java.util.Scanner;
import java.lang.String;

public class CheckAlphanumeric {
    public static boolean isAlphanumeric(char c) {
        if (c >= 48 && c <= 57) {
            return true; 
        } else if (c >= 65 && c <= 90) {
            return true; 
        } else if (c >= 97 && c <= 122) {
            return true; 
        } else {
            return false; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);

        if (isAlphanumeric(input)) {
            System.out.println(input + " is an alphanumeric character.");
        } else {
            System.out.println(input + " is not an alphanumeric character.");
        }

        sc.close();

    }
    
    
}
