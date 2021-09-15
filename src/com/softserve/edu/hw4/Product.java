package com.softserve.edu.hw4;

import java.util.*;

public class Product {
    private int price;
    private String name;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    public static void main(String[] args) {

        Product product1 = new Product(30, "Cat");
        Product product2 = new Product(20, "Dog");
        Product product3 = new Product(40, "Owl");
        Product product4 = new Product(70, "Deer");
        Product product5 = new Product(30, "Cat");

    List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        for (int i=0; i<products.size(); i++)
        {
            for (int j = i+1; j< products.size();j++) {
                if (products.get(i).equals(products.get(j))){
                    System.out.println(products.get(i));
                }
            }
        }
    }
}
