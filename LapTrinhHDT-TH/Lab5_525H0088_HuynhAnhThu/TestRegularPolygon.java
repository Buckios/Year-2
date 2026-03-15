public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        System.out.println(p1.toString());

        RegularPolygon p2 = new RegularPolygon("q1", 4, 1.5);
        System.out.println(p2.toString());

        RegularPolygon p3 = new RegularPolygon("penta", 5);
        System.out.println(p3.toString());

        RegularPolygon p4 = new RegularPolygon(p2);
        p4.setName("hexa");
        p4.setEdgeAmount(6);
        p4.setEdgeLength(2.0);

        System.out.println("Name: " + p4.getName());
        System.out.println("Edge amount: " + p4.getEdgeAmount());
        System.out.println("Edge length: " + p4.getEdgeLength());
        System.out.println("Type: " + p4.getPolygon());
        System.out.println("Perimeter: " + p4.getPerimeter());
        System.out.println("Area: " + p4.getArea());

        p4.setEdgeAmount(8);
        System.out.println("Type (8 edges): " + p4.getPolygon());
        System.out.println("Area (8 edges): " + p4.getArea());
    }
}