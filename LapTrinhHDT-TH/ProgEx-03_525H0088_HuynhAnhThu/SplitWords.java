import java.util.Scanner;
import java.util.Arrays;

public class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a comma-separated list of items: ");
        String input = sc.nextLine();

        String[] result = splitByComma(input);
        System.out.println("Split items: " + Arrays.toString(result));

        sc.close();
    }

    public static String[] splitByComma(String s) {
        String[] parts = s.split(",");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }
        return parts;
    }
}