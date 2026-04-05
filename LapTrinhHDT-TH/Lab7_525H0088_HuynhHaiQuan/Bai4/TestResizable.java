public class TestResizable {
    public static void main(String[] args) {
        ResizableCircle rc1 = new ResizableCircle(10.0);
        System.out.printf("Original radius: %.1f and area: %.2f%n", rc1.radius, rc1.getArea());
        
        rc1.resize(50);
        System.out.printf("Area after 50%% resize: %.2f%n", rc1.getArea());

        ResizableCircle rc2 = new ResizableCircle(25.5);
        System.out.printf("Original radius: %.1f and area: %.2f%n", rc2.radius, rc2.getArea());
        
        rc2.resize(200);
        System.out.printf("Area after 200%% resize: %.2f%n", rc2.getArea());
    }
}