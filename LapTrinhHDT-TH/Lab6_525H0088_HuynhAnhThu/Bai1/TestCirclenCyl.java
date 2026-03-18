public class TestCirclenCyl {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5, "blue");
        System.out.println(c1.toString());
        System.out.printf("Area: %.2f%n", c1.getArea());

        Cylinder cyl1 = new Cylinder();
        System.out.println(cyl1.toString());
        System.out.printf("Volume: %.2f%n", cyl1.getVolume());

        Cylinder cyl2 = new Cylinder(5.0, 2.0);
        System.out.println(cyl2.toString());
        System.out.printf("Volume: %.2f%n", cyl2.getVolume());

        Cylinder cyl3 = new Cylinder(3.0, 4.0, "green");
        System.out.println(cyl3.toString());
        System.out.printf("Volume: %.2f%n", cyl3.getVolume());
        
        cyl3.setHeight(10.0);
        cyl3.setRadius(2.0);
        cyl3.setColor("yellow");
        System.out.println(cyl3.toString());
        System.out.printf("New Area: %.2f%n", cyl3.getArea());
        System.out.printf("New Volume: %.2f%n", cyl3.getVolume());
    }
}