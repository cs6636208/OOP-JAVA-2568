import java.util.Scanner;

public class LinearEquation {
    private double a, b, c, d, e, f;

    // Constructor
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // ตรวจสอบว่ามี solution หรือไม่
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // คำนวณค่า x
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // คำนวณค่า y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    // Main Program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a b c d e f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.printf("x is %.1f and y is %.1f\n", equation.getX(), equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }

        input.close();
    }
}
