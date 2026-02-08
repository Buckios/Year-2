public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", "Black", 100.0);
        Car car2 = new Car("Honda", "Civic", "White", 120.0);

        System.out.println(car1.toString());
        System.out.println(car2.toString());

        car1.setSpeed(250.0); 
        System.out.println("Speed after invalid set attempt: " + car1.getSpeed());

        car1.accelerate(50);
        System.out.println("Speed after accelerate(50): " + car1.getSpeed());

        car1.accelerate(30, true);
        System.out.println("Speed after turbo accelerate(30): " + car1.getSpeed());

        car1.brake(200);
        System.out.println("Speed after brake(200): " + car1.getSpeed());

        Car fasterCar = car1.speedCompare(car2);
        System.out.println("The faster car is: " + fasterCar.toString());
    }
}