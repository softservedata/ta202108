package com.softserve.edu.HW5;

import com.softserve.edu.HW4.Product;

public class LowestPriceProduct  {
    public static void main(String[] args) {


        Product[] products = new Product[10];
        products[0] = new Product("product 1", 133.6);
        products[1] = new Product("product 2", 13.2);
        products[2] = new Product("product 3", 14.0);
        products[3] = new Product("product4", 5.6);
        products[4] = new Product("product 5", 3.2);
        products[5] = new Product("product 6", 54.6);
        products[6] = new Product("product 7", 55.6);
        products[7] = new Product("product 8", 33);
        products[8] = new Product("product 9", 55.6);
        products[9] = new Product("product 10", 600);

    Product LowestPriceProduct = products[9];
    double leastPrice = LowestPriceProduct.getPrice();
        for(Product product: products) {
        if (product.getPrice() < leastPrice) {
            leastPrice = product.getPrice();
            LowestPriceProduct = product;
        }
    }
        System.out.println("Product with lowest price is: " + LowestPriceProduct.getName());
}
}
