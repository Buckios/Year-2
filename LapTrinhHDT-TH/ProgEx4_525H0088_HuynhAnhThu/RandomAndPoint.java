import java.util.Random;
import java.awt.Point;

public class RandomAndPoint {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomX = rand.nextInt(101);
        int randomY = rand.nextInt(101);

        Point randomPoint = new Point(randomX, randomY);
        Point randomB = new Point(20,30);

        double distance = randomPoint.distance(randomB);

        System.out.println("Random Point A: (" + randomPoint.x + ", " + randomPoint.y + ")");
        System.out.println("Point B: (" + randomB.x + ", " + randomB.y + ")");
        System.out.printf("Distance between Point A and Point B: %.2f\n", distance);

    }
}
