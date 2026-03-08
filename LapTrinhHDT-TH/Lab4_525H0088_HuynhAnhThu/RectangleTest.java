public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Rectangle r2 = new Rectangle(2.5f, 4.0f);
        System.out.println(r2.toString());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

        r2.setWidth(5.0f);
        r2.setLength(10.0f);
        System.out.println(r2.getWidth());
        System.out.println(r2.getLength());
        System.out.println(r2.toString());
    }
}