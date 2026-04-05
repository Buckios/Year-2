public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
        super();
    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        this.radius = this.radius * (percent / 100.0);
    }
}