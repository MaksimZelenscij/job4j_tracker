package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i > index) {
                products[i - 1] = products[i];
            }
            if (i == index || i == products.length - 1) {
                products[i] = null;
            }
        }
        return products;
    }
}