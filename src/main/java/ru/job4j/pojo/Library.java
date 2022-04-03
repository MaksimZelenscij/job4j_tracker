package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book[] books = createBooks();
        for (Book b : books) {
            System.out.println(b.getTitle() + " - " + b.getNumberOfPages());
        }

        Book t = books[0];
        books[0] = books[3];
        books[3] = t;
        for (Book b : books) {
            System.out.println(b.getTitle() + " - " + b.getNumberOfPages());
        }

        for (Book b : books) {
            if (Objects.equals(b.getTitle(), "Clean code")) {
                System.out.println("Shown only books with title Clean code - " + b.getTitle() + " - " + b.getNumberOfPages());
            }
        }
    }

    private static Book[] createBooks() {
        Book brom = new Book("Krampus", 600);
        Book pelevin = new Book("Generation V", 800);
        Book geiman = new Book("American God's", 1000);
        Book cleanCode = new Book("Clean code", 100);
        Book[] books = new Book[4];
        books[0] = brom;
        books[1] = pelevin;
        books[2] = geiman;
        books[3] = cleanCode;
        return books;
    }
}
