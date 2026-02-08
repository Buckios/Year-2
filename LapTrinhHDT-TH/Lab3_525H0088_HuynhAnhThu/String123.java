import java.util.Scanner;

public class String123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String input = sc.nextLine();

        System.out.println("First and Last name: " + getFirstAndLastName(input));
        System.out.println("Middle name: " + getMiddleName(input));
        System.out.println("Capitalized: " + capitalizeName(input));
        System.out.println("Vowels Upper/Consonants Lower: " + formatVowelsAndConsonants(input));

        sc.close();
    }

    public static String getFirstAndLastName(String name) {
        String[] words = name.trim().split("\\s+");
        if (words.length < 2) {
            return name;
        }
        return words[0] + " " + words[words.length - 1];
    }

    public static String getMiddleName(String name) {
        String[] words = name.trim().split("\\s+");
        if (words.length <= 2) {
            return ""; 
        }
        StringBuilder middle = new StringBuilder();
        for (int i = 1; i < words.length - 1; i++) {
            middle.append(words[i]).append(" ");
        }
        return middle.toString().trim();
    }

    public static String capitalizeName(String name) {
        String[] words = name.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String formatVowelsAndConsonants(String name) {
        StringBuilder result = new StringBuilder();
        String vowels = "AEIOUaeiou";
        for (char c : name.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isLetter(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}