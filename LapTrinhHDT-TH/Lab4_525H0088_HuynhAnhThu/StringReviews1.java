import java.util.Scanner;

public class StringReviews1 {

    public static String shortName(String str) {
        String[] parts = str.trim().split("\\s+");
        if (parts.length < 2) return str;
        return parts[parts.length - 1] + " " + parts[0];
    }

    public static String hashtagName(String str) {
        String[] parts = str.trim().split("\\s+");
        if (parts.length < 2) return "#" + str.replace(" ", "");
        return "#" + parts[parts.length - 1] + parts[0];
    }

    public static String upperCaseAllVowel(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = Character.toLowerCase(chars[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public static String upperCaseAllN(String str) {
        return str.replace('n', 'N');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a full name: ");
        String name = scanner.nextLine();

        System.out.println("Short Name: " + shortName(name));
        System.out.println("Hashtag Name: " + hashtagName(name));
        System.out.println("Uppercase Vowels: " + upperCaseAllVowel(name));
        System.out.println("Uppercase N: " + upperCaseAllN(name));

        scanner.close();
    }
}