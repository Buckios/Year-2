public class TestMovable {
    public static void main(String[] args) {
        Movable point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point.toString());
        
        point.moveUp();
        point.moveRight();
        System.out.println(point.toString());

        Movable circle = new MovableCircle(5, 5, 1, 2, 10);
        System.out.println(circle.toString());
        
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle.toString());
    }
}