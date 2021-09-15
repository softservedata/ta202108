package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

public class HomeWork5 {
    public static void main(String[] args) {
        Product [] products = new Product[10];
        products [0] = new Product(10, "Cat");
        products [1] = new Product(15, "Dog");
        products [2] = new Product(20, "Owl");
        products [3] = new Product(11, "Raccoon");
        products [4] = new Product(17, "Rabbit");
        products [5] = new Product(13, "Camel");
        products [6] = new Product(19, "Wolf");
        products [7] = new Product(5, "Fox");
        products [8] = new Product(7, "Sparrow");
        products [9] = new Product(1, "Lion");
        int min = products [0].getPrice();
        Product productWithMinPrice = new Product(3, "Worm");
        for (int i = 0; i<products.length; i++) {
            if (products [i].getPrice()<min){
                min = products [i].getPrice();
                productWithMinPrice = products [i];
            }
        }
        System.out.println(productWithMinPrice);
    }
}
