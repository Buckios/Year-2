public class Circle implements GeometricObject {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}