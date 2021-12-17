package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void testDistance() {
        Point point = new Point(4, 5);
        Point point2 = new Point(1, 1);
        double actual = point.distance(point2);
        double expected = 5;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testDistance3d() {
        Point point = new Point(1, 1, 1);
        Point point2 = new Point(2, 2, 2);
        double actual = point.distance(point2);
        double expected = 1.4;
        assertEquals(expected, actual, 0.1);
    }
}