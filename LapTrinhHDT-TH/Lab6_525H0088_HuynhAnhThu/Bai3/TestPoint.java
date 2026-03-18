import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p2a = new Point2D();
        System.out.println(p2a.toString());

        Point2D p2b = new Point2D(1.5f, 2.5f);
        System.out.println(p2b.toString());

        p2b.setX(3.0f);
        p2b.setY(4.0f);
        System.out.println(p2b.toString());

        p2b.setXY(5.5f, 6.5f);
        System.out.println(Arrays.toString(p2b.getXY()));

        System.out.println("---");

        Point3D p3a = new Point3D();
        System.out.println(p3a.toString());

        Point3D p3b = new Point3D(1.1f, 2.2f, 3.3f);
        System.out.println(p3b.toString());

        p3b.setZ(4.4f);
        System.out.println(p3b.toString());

        p3b.setXYZ(7.7f, 8.8f, 9.9f);
        System.out.println(Arrays.toString(p3b.getXYZ()));
    }
}