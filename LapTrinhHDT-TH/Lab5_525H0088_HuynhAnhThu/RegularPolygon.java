public class RegularPolygon {
    private String name;
    private int edgeAmount;
    private double edgeLength;

    public RegularPolygon() {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }

    public RegularPolygon(String name, int edgeAmount, double edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(String name, int edgeAmount) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }

    public String getName() {
        return name;
    }

    public int getEdgeAmount() {
        return edgeAmount;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdgeAmount(int num) {
        this.edgeAmount = num;
    }

    public void setEdgeLength(double length) {
        this.edgeLength = length;
    }

    public String getPolygon() {
        if (edgeAmount == 3) {
            return "Triangle";
        } else if (edgeAmount == 4) {
            return "Quadrangle";
        } else if (edgeAmount == 5) {
            return "Pentagon";
        } else if (edgeAmount == 6) {
            return "Hexagon";
        } else if (edgeAmount > 6) {
            return "Polygon has the number of edges greater than 6";
        }
        return "";
    }

    public double getPerimeter() {
        return edgeLength * edgeAmount;
    }

    public double getArea() {
        double a = 0;
        if (edgeAmount == 3) {
            a = 0.433;
        } else if (edgeAmount == 4) {
            a = 1;
        } else if (edgeAmount == 5) {
            a = 1.72;
        } else if (edgeAmount == 6) {
            a = 2.595;
        } else if (edgeAmount > 6) {
            return -1;
        }
        return (edgeLength * edgeLength) * a;
    }

    public String toString() {
        return name + " - " + getPolygon() + " - " + getArea();
    }
}