import java.util.Scanner;

public class CircleMath {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = calcArea(radius);
        System.out.println("Area: " + area);
        sc.close();
    }

    public static double calcArea(double r) {
        return PI * r * r;
    }
}