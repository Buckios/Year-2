import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password to validate: ");
        String input = scanner.nextLine();

        System.out.println("\nValidating password...");
        boolean isValid = getPasswordValidator(input);

        if (isValid) {
            System.out.println("Password created successfully!");
        } else {
            System.out.println("Invalid password. Password must containt the above requirements:");
        }

        scanner.close();
    }

    public static boolean getPasswordValidator(String password) {
        boolean isValid = true;

        if (password.length() < 8) {
            System.out.println("It must be at least 8 characters long.");
            isValid = false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (!hasUpper) {
            System.out.println("It must contain at least one uppercase letter.");
            isValid = false;
        }

        if (!hasLower) {
            System.out.println("It must contain at least one lowercase letter.");
            isValid = false;
        }

        if (!hasDigit) {
            System.out.println("It must contain at least one digit.");
            isValid = false;
        }

        return isValid;
    }
}
