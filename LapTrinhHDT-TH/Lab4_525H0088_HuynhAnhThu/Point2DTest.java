public class Point2DTest {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        System.out.println(point1.getX());
        System.out.println(point1.getY());

        Point2D point2 = new Point2D(5.5f, 10.2f);
        System.out.println(point2.getX());
        System.out.println(point2.getY());
    }
}