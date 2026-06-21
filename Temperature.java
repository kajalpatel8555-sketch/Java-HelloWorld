public class Temperature {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Celsius = %.2f", celsius);
    }
}