public class Temperature {
    private double celsius;
    private String location;

    public Temperature() {
    }

    public Temperature(double celsius, String location) {
        this.celsius = celsius;
        this.location = location;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void toFahrenheit() {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
    }

    public void toKelvin() {
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " Celsius = " + kelvin + " Kelvin");
    }

    public Temperature compares(Temperature tem) {
        if (this.celsius > tem.getCelsius()) {
            return this;
        } else {
            return tem;
        }
    }

    public String toString() {
        return "Temperature[celsius=" + celsius + ", location=" + location + "]";
    }
}