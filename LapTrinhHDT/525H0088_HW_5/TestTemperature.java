public class TestTemperature {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(30.0, "HoChiMinh");
        Temperature temp2 = new Temperature(20.0, "NewYork");

        System.out.println(temp1.toString());
        System.out.println(temp2.toString());

        temp1.toFahrenheit();
        temp1.toKelvin();

        temp1.setCelsius(35.0);
        System.out.println("Updated Temp1 Celsius: " + temp1.getCelsius());

        Temperature higherTemp = temp1.compares(temp2);
        System.out.println("The higher temperature is: " + higherTemp.toString());
    }
}