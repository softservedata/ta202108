package com.softserve.edu.hw4;

import java.util.ArrayList;

public class Product {

    String name;

    float price;

    /**
     * @param name
     * @param price
     */
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @return float
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param price float
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return String
     */
    public String toString() {
        return "Product: " + name;
    }

    /**
     *
     * @param productCompared Product
     * @return
     */
    public boolean equals(Product productCompared) {
        if (productCompared == this) {
            return true;
        }
        if (productCompared.getName().equals(this.name) &&
                productCompared.getPrice() == this.price) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("product1", 5.6f);
        products[1] = new Product("product2", 55.6f);
        products[2] = new Product("product5", 8);
        products[3] = new Product("product2", 55.6f);
        products[4] = new Product("product5", 8);
        ArrayList<Product> repeatedProductsList = new ArrayList<Product>();

        for (int i = 0; i < 4; i++) {
            outerloop:
            for (int y = i + 1; y < 5; y++) {
                if (products[i] != products[y] && products[i].equals(products[y]) &&
                        !repeatedProductsList.contains(products[i])) {
                    repeatedProductsList.add(products[i]);
                    break outerloop;
                }
            }
        }

        System.out.println("Repeated products are: " + repeatedProductsList.toString());
    }
}
