import java.util.Scanner;

public class CheckTriangle1 {
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return onTheSameLine(x0, y0, x1, y1, x2, y2) && (x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1))
                && (y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        scanner.close();
        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("2");
        } else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
