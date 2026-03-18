public class TestShapes {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println("Basic Shape Info: " + shape.toString());

        Circle circle = new Circle(2.5, "green", true);
        System.out.println("Circle Info: " + circle.toString());
        System.out.printf("Circle Area: %.2f%n", circle.getArea());

        Rectangle rectangle = new Rectangle(2.0, 4.0, "yellow", false);
        System.out.println("Rectangle Info: " + rectangle.toString());
        System.out.printf("Rectangle Area: %.2f%n", rectangle.getArea());

        Square square = new Square(3.0, "purple", true);
        System.out.println("Square Info: " + square.toString());
        System.out.printf("Square Area: %.2f%n", square.getArea());

        square.setSide(5.0);
        System.out.println("New Square Info: " + square.toString());
        System.out.printf("New Square Area: %.2f%n", square.getArea());
    }
}