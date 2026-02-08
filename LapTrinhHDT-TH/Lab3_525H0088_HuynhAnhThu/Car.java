public class Car {
    private String brand;
    private String name;
    private String color;
    private double speed;
    private static final double MAX_SPEED = 200.0;

    public Car() {
    }

    public Car(String brand, String name, String color, double speed) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        if (speed >= 0 && speed <= MAX_SPEED) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed >= 0 && speed <= MAX_SPEED) {
            this.speed = speed;
        }
    }

    public static double getMaxSpeed() {
        return MAX_SPEED;
    }

    public void accelerate(int value) {
        if (value > 0) {
            if (this.speed + value <= MAX_SPEED) {
                this.speed += value;
            } else {
                this.speed = MAX_SPEED;
            }
        }
    }

    public void accelerate(int value, boolean turboMode) {
        if (turboMode) {
            accelerate(value * 2);
        } else {
            accelerate(value);
        }
    }

    public void brake(int value) {
        if (value > 0) {
            if (this.speed - value >= 0) {
                this.speed -= value;
            } else {
                this.speed = 0;
            }
        }
    }

    public Car speedCompare(Car car2) {
        if (car2.getSpeed() > this.speed) {
            return car2;
        } else {
            return this;
        }
    }

    public String toString() {
        return "Car[brand=" + brand + ", name=" + name + ", color=" + color + ", speed=" + speed + "]";
    }
}