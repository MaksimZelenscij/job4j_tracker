package ru.job4j.oop;

public class Reduce {
    private int[] assortment;

    public void to(int[] array) {
        assortment = array;
    }

    public void print() {
        for (int i : assortment) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
