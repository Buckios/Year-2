public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 10.0);

        System.out.println(rect1.toString());

        rect1.setWidth(7.0);
        rect1.setLength(12.0);

        System.out.println("New Width: " + rect1.getWidth());
        System.out.println("New Length: " + rect1.getLength());
        System.out.println("New Area: " + rect1.calculateArea());
        System.out.println("New Perimeter: " + rect1.calculatePerimeter());

        System.out.println(rect1.toString());
        
        Rectangle rect2 = new Rectangle();
        rect2.setWidth(3.0);
        rect2.setLength(4.0);
        System.out.println(rect2.toString());
    }
}