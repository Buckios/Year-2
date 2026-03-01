public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p) {
        if (p != null) {
            this.x = p.x;
            this.y = p.y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint[x=" + x + ", y=" + y + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        MyPoint myPoint = (MyPoint) obj;
        
        if (x != myPoint.x) return false;
        return y == myPoint.y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(MyPoint p) {
        if (p == null) return -1;
        return distance(p.x, p.y);
    }
}