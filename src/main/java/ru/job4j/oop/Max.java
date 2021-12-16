package ru.job4j.oop;

public class Max {
    public static int getMax(int first, int second) {
        return first > second ? first : second;
    }

    public static int getMax(int first, int second, int third) {
        return getMax(getMax(first, second), third);
    }

    public static int getMax(int first, int second, int third, int fourth) {
        return getMax(getMax(first, second, third), fourth);
    }
}

