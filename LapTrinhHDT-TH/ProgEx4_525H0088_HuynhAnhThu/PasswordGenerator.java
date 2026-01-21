import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        
        String password = "";
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            int choice = random.nextInt(3);
            
            if (choice == 0) {
                int index = random.nextInt(uppercaseLetters.length());
                password = password + uppercaseLetters.charAt(index);
            } else if (choice == 1) {
                int index = random.nextInt(lowercaseLetters.length());
                password = password + lowercaseLetters.charAt(index);
            } else {
                int digit = random.nextInt(10);
                password = password + digit;
            }
        }
        
        System.out.println("Your 10 character super secure password is: " + password);
    }
}