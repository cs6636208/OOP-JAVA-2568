import java.util.Scanner;

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class ClosestPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points[i] = new Point(x, y);
        }
        double minDistance = Double.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = points[i].distanceTo(points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        System.out.printf("%.2f\n", minDistance);
    }
}
