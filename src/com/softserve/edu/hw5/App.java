package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Product[] products = new Product[10];

        String productName = "Product";
        double startingPrice = 100.0;
        int priceStep = 10;

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(productName + "_" + i, startingPrice);
            startingPrice += priceStep;
        }

        products[0].setPrice(155.0);
        products[3].setPrice(100.0);
        products[5].setPrice(100.0);

        double lowestPrice = products[0].getPrice();

        List<Product> cheapestProducts = new ArrayList<>();
        cheapestProducts.add(products[0]);

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() < lowestPrice) {
                lowestPrice = products[i].getPrice();
                cheapestProducts = new ArrayList<>();
                cheapestProducts.add(products[i]);
            } else if (products[i].getPrice() == lowestPrice) {
                cheapestProducts.add(products[i]);
            }
        }

        for (Product product : cheapestProducts) {
            System.out.println(product);
        }

//        check the array with all products in order to compare
//        System.out.println("------All 10 products------");
//        for (Product product : products) {
//            System.out.println(product);
//        }
    }
}
