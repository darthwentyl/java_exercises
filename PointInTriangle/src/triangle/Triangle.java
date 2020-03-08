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
    private Point X;
    private Point Y;
    private Point Z;

    Triangle(Point X_, Point Y_, Point Z_) {
        X = X_;
        Y = Y_;
        Z = Z_;
    }

    public String toString() {
        return "X" + X + "; Y" + Y + "; Z" + Z + ";";
    }
    
    public boolean isInTriangle(Point p) {
        return false;
    }
}

