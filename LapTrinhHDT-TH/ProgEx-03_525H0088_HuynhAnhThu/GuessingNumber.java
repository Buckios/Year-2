import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) + 1;
        int guess = 0;

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high");
            } else if (guess < randomNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct!");
            }
        }

        sc.close();
    }
}