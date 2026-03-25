public class Test {
    public static void main(String[] args) {
        Shape s = new Rectangle(4, 3, "white");
        System.out.println(s.toString());
        System.out.println("Area = " + s.getArea());

        s = new Triangle(8, 7, "black");
        System.out.println(s.toString());
        System.out.println("Area = " + s.getArea());
    }
}