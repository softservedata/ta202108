package com.softserve.edu.hw4;

import java.util.Objects;

public class Product {
    private String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
    public Product(String productName) {
        this.productName = productName;
        this.price = -1;
    }
    public Product(int price) {
        this.productName = "";
        this.price = price;
    }
    public Product() {
        this.productName = "";
        this.price = -1;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return Double.compare(product.getPrice(), getPrice()) == 0 && getProductName().equals(product.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getPrice());
    }
}
