package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

public class CheapestProductApp {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("product1", 5.6f);
        products[1] = new Product("product2", 55.6f);
        products[2] = new Product("product3", 1);
        products[3] = new Product("product4", 55.6f);
        products[4] = new Product("product5", 8);
        products[0] = new Product("product6", 5444.6f);
        products[1] = new Product("product7", 55.6f);
        products[2] = new Product("product8", 0.88f);
        products[3] = new Product("product9", 55.6f);
        products[4] = new Product("product10", 8);

        Product cheapestProduct = products[0];
        float leastPrice = cheapestProduct.getPrice();
        for(Product product: products) {
            if (product.getPrice() < leastPrice) {
                leastPrice = product.getPrice();
                cheapestProduct = product;
            }
        }
        System.out.println("Product with least prce is: " + cheapestProduct.getName());
    }
}
