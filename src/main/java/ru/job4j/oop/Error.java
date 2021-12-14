package ru.job4j.oop;

public class Error {
    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Обнаружена ошибка: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error notFoundError = new Error(true, 404, "не найдено");
        Error tooEarlyError = new Error(false, 425, "слишком рано");
        error.printInfo();
        notFoundError.printInfo();
        tooEarlyError.printInfo();
    }
}
