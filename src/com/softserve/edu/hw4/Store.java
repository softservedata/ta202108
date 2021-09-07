package com.softserve.edu.hw4;

import java.util.Random;

public class Store {
    public static final int AMOUNT_OF_NUMBERS = 15;
    public static final Random random = new Random();

    public static void main(String[] args) {
        Product[] products = new Product[AMOUNT_OF_NUMBERS];
        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            int randomInt = random.nextInt(AMOUNT_OF_NUMBERS);
            products[i] = new Product("Product" + randomInt, 2.5 * randomInt);
        }

        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\nDuplicate products:");
        Product[] tempProducts = new Product[products.length];
        System.arraycopy(products, 0, tempProducts, 0, products.length);
        for (int i = 0; i < AMOUNT_OF_NUMBERS - 1; i++) {
            Product product = tempProducts[i];
            if (product != null) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < AMOUNT_OF_NUMBERS; j++) {
                    if (product.equals(tempProducts[j])) {
                        isDuplicate = true;
                        tempProducts[j] = null;
                    }
                }
                if (isDuplicate) {
                    System.out.println(product);
                }
            }
        }
    }
}
