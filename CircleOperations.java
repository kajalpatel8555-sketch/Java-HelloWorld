public class CircleOperations {

    static double area(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        double radius = 5;

        System.out.println("Area = " + area(radius));
    }
}