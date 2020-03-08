package triangle;

class Point {
    private double x;
    private double y;

    Point(double x_, double y_) {
        x = x_;
        y = y_;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double dist(Point p) {
        double dx = x - p.getX();
        double dy = y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    Triangle(Point A_, Point B_, Point C_) {
        A = A_;
        B = B_;
        C = C_;
    }

    // The area is calculated by Heron formula:
    // https://en.wikipedia.org/wiki/Heron%27s_formula
    public double calcArea() {
        double a = A.dist(B);
        double b = B.dist(C);
        double c = C.dist(A);
        double s = (a + b + c) / 2;
        
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        // rounded to three decimal places
        area *= 1000;
        area = Math.round(area);
        area /= 1000;
        return area;
    }

    public String toString() {
        return "A" + A + "; B" + B + "; C" + C + ";";
    }

    public boolean isInTriangle(Point p) {
        double thisArea = this.calcArea();

        Triangle D1 = new Triangle(A, B, p);
        double d1 = D1.calcArea();

        Triangle D2 = new Triangle(A, p, C);
        double d2 = D2.calcArea();

        Triangle D3 = new Triangle(p, B, C);
        double d3 = D3.calcArea();

        return (thisArea - d1 - d2 - d3) == 0;
    }
}

