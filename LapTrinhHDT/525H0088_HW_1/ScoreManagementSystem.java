import java.util.Scanner;
public class ScoreManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Math score: ");
        double math = sc.nextDouble();
        System.out.print("Enter Literature score: ");
        double lit = sc.nextDouble();
        System.out.print("Enter English score: ");
        double eng = sc.nextDouble();

        double average = avg(math, lit, eng);

        System.out.println("Weighted Average: " + average);
        System.out.println("Rank: " + rank(average));

    sc.close(); 

    }
    public static double avg(double math, double lit, double eng) {
        return ((math*2) + lit + eng) / 4.0;
    }
    public static String rank(double average) {
        if (average >= 8.0) {
            return "A";
        } else if (average >= 5.0) {
            return "B";
        } else {
            return "C";
        }
    }
}
