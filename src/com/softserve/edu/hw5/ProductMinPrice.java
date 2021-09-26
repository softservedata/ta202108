package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;


public class ProductMinPrice {
    public static void main(String[] args) {
        Product[] product = new Product[10];
        product[0] = new Product("Book 1", 5);
        product[1] = new Product("Book 2", 25);
        product[2] = new Product("Book 3", 15);
        product[3] = new Product("Book 4", 30);
        product[4] = new Product("Book 5", 50);
        product[5] = new Product("Book 6", 25);
        product[6] = new Product("Book 7", 55);
        product[7] = new Product("Book 8", 40);
        product[8] = new Product("Book 9", 55);
        product[9] = new Product("Book 10", 45);

        int min = product[0].getPrice();
        String nameMin = product[0].getProductName();
        for (Product value : product) {
            if (value.getPrice() < min) {
                min = value.getPrice();
                nameMin = value.getProductName();
            }
        }
        System.out.println("cheapest product = " + nameMin + " with price: " + min);
    }
}
