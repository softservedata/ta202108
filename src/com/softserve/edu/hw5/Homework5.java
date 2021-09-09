package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

public class Homework5 {

    public static void main(String[] args) {
        Product[] products = new Product[10];
        products[0] = new Product (30, "black");
        products[1] = new Product (20, "yellow");
        products[2] = new Product (50, "green");
        products[3] = new Product (20, "yellow");
        products[4] = new Product (60, "red");
        products[5] = new Product (15, "black");
        products[6] = new Product (20, "yellow");
        products[7] = new Product (50, "green");
        products[8] = new Product (20, "yellow");
        products[9] = new Product (60, "red");

        int minimal = products[0].getPrice();
        Product productMinPrice = new Product(30, "black");

        for (Product product:products){
            if (product.getPrice()<minimal)
            {
                minimal= product.getPrice();
                productMinPrice =product;
            }
        }
        System.out.println(productMinPrice);
    }
}
