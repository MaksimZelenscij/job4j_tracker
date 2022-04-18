package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static boolean turn = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        int count = 11;
        processMoves(input, count);
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }

    private static void processMoves(Scanner input, int count) {
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 1 || matches > 3 || matches > count) {
                System.out.println("Неверное количество спичек.");
                continue;
            }
            count = count - matches;
            System.out.println("На столе осталось " + count + " спичек.");
            turn = !turn;
        }
    }
}