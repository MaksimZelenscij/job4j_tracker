package ru.job4j.oop;

public class Max {
    public static int getMax(int first, int second) {
        return first > second ? first : second;
    }

    public static int getMax(int first, int second, int third) {
        int max = getMax(first, second);
        return max > third ? max : third;
    }

    public static int getMax(int first, int second, int third, int fourth) {
        int max = getMax(first, second, third);
        return max > fourth ? max : fourth;
    }
}

