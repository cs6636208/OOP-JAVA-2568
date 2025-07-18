import java.util.Scanner;

public class MyTriangle {
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3);
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        if (MyTriangle.isValid(side1, side2, side3)) {
            System.out.println(String.format("%.2f", MyTriangle.area(side1, side2, side3)));
        } else {
            System.out.println(0);
        }
    }
}
