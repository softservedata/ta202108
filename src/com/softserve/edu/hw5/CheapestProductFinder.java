package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

import java.util.Random;

public class CheapestProductFinder {
    public static final int AMOUNT_OF_NUMBERS = 10;
    public static final Random random = new Random();

    public static void main(String[] args) {
        Product[] products = new Product[AMOUNT_OF_NUMBERS];
        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            products[i] = new Product("Product" + random.nextInt(AMOUNT_OF_NUMBERS * 10),
                    random.nextInt(AMOUNT_OF_NUMBERS * 1000) / 100.0);
        }

        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\nThe cheapest product:");
        Product cheapestProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (cheapestProduct.getPrice() > products[i].getPrice()) {
                cheapestProduct = products[i];
            }
        }
        System.out.println(cheapestProduct.getName());
    }
}
