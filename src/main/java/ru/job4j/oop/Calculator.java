package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int z) {
        return (sum(z) + multiply(z) + minus(z) + divide(z));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(10));
        System.out.println(minus(10));
        System.out.println(calculator.divide(10));
        System.out.println(calculator.multiply(10));
        System.out.println(calculator.sumAllOperation(10));
    }

}


