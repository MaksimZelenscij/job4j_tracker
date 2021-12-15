package ru.job4j.oop;

import junit.framework.TestCase;

public class MaxTest extends TestCase {

    public void testGetMaxOf2Numbers() {
        int actual = Max.getMax(12, 13);
        int expected = 13;
        assertEquals(expected, actual);
    }

    public void testGetMaxOf3Numbers() {
        int actual = Max.getMax(12, 13, 17);
        int expected = 17;
        assertEquals(expected, actual);
    }

    public void testGetMaxOf4Numbers() {
        int actual = Max.getMax(12, 13, 17, 88);
        int expected = 88;
        assertEquals(expected, actual);
    }
}