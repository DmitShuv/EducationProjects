import java.util.Scanner;

public class TriangleArea {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        Triangle triangle = new Triangle(new Point(x1, y1), new Point(x2, y2),  new Point(x3, y3));
        System.out.println(triangle.area());
    }
}

class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double A = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + (Math.pow((a.getY() - b.getY()), 2)));
        double B = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + (Math.pow((b.getY() - c.getY()), 2)));
        double C = Math.sqrt(Math.pow((a.getX() - c.getX()), 2) + (Math.pow((a.getY() - c.getY()), 2)));
        double P = (A+B+C)/2;
        double Area = Math.sqrt(P*(P-A)*(P-B)*(P-C));
        if (((A+B) < C) || ((A+C) < B) || ((B+C) < A) || Area == 0){
            System.out.println("Треугольник не существует");
            System.exit(0);
        }
        else{
            return Area;
        }
        return Area;
    }
}

class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
