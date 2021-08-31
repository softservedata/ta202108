package com.softserve.edu.hw4;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Le Silpo Desk", 5999.99);
        Product product2 = new Product("PC", 2000);
        Product product3 = new Product("PC", 2000);
        Product product4 = new Product();
        Product product5 = new Product();

        product4.setName("Keyboard");
        product4.setPrice(659.5);
        product5.setName("Keyboard");
        product5.setPrice(659.1); // price a bit differs from the previous

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

//        Map<String, Product> productsMap = new HashMap<>();
//
//        for (int i = 0; i < 5; i++) {
//            Product tempProduct = products.get(i);
//            if(productsMap.putIfAbsent(tempProduct.getName(), tempProduct) != null){
//                Printer.printToCounsel(tempProduct);
//            }
//        }

        Set<Product> uniqueProducts = new HashSet<>(products);
        Iterator<Product> iterator = uniqueProducts.iterator();
        while (iterator.hasNext()) {
            Product tempProduct = iterator.next();
            if (Collections.frequency(products, tempProduct) > 1) {
                Printer.printToConsole(tempProduct);
            }
        }
    }
}
