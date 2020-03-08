package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void test_isInTriangleTrue_1() {
        Triangle triangle = new Triangle(new Point(-6, -3), 
                                         new Point(7, -1), 
                                         new Point(0, 4));
        Point p = new Point(-1, 2);
        assertTrue(triangle.isInTriangle(p));
    }

    @Test
    void test_isInTriangleTrue_2() {
        Triangle triangle = new Triangle(new Point(-6, -3), 
                                         new Point(7, -1), 
                                         new Point(0, 4));
        Point p = new Point(1, 2);
        assertTrue(triangle.isInTriangle(p));
    }

    @Test
    void test_isInTriangleTrue_3() {
        Triangle triangle = new Triangle(new Point(-6, -3), 
                                         new Point(7, -1), 
                                         new Point(0, 4));
        Point p = new Point(-1, -1);
        assertTrue(triangle.isInTriangle(p));
    }

    @Test
    void test_isInTriangleTrue_4() {
        Triangle triangle = new Triangle(new Point(-6, -3), 
                                         new Point(7, -1), 
                                         new Point(0, 4));
        Point p = new Point(1, -1);
        assertTrue(triangle.isInTriangle(p));
    }

    @Test
    void test_isInTriangleFalse_1() {
        Triangle triangle = new Triangle(new Point(-6, -3), 
                                         new Point(7, -1), 
                                         new Point(0, 4));
        Point p = new Point(-3, 4);
        assertFalse(triangle.isInTriangle(p));
    }

    @Test
    void test_isInTriangleFalse_2() {
        Triangle triangle = new Triangle(new Point(-6, -3), 
                                         new Point(7, -1), 
                                         new Point(0, 4));
        Point p = new Point(5, 4);
        assertFalse(triangle.isInTriangle(p));
    }

    @Test
    void test_isInTriangleFalse_3() {
        Triangle triangle = new Triangle(new Point(-6, -3), 
                                         new Point(7, -1), 
                                         new Point(0, 4));
        Point p = new Point(-3, -3);
        assertFalse(triangle.isInTriangle(p));
    }

    @Test
    void test_isInTriangleFalse_4() {
        Triangle triangle = new Triangle(new Point(-6, -3), 
                                         new Point(7, -1), 
                                         new Point(0, 4));
        Point p = new Point(5, -3);
        assertFalse(triangle.isInTriangle(p));
    }

}
