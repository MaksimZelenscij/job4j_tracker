package ru.job4j.oop;

import junit.framework.TestCase;

public class PointTest extends TestCase {

    public void testDistance() {
        Point point = new Point(4, 5);
        Point point2 = new Point(1, 1);
        double actual = point.distance(point2);
        double expected = 5;
        assertEquals(expected, actual);
    }

    public void testDistance3d() {
        Point point = new Point(1, 1, 1);
        Point point2 = new Point(2, 2, 2);
        double actual = point.distance(point2);
        double expected = 1.4142135623730951;
        assertEquals(expected, actual);
    }
}