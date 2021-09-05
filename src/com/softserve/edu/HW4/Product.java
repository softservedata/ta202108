package com.softserve.edu.HW4;

public class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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
        return Double.compare(product.getPrice(), getPrice()) == 0 && getName().equals(product.getName());
    }

    public static void main(String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product("carrot");
        products[1] = new Product("carrot");
        products[2] = new Product("potato", 11.25);
        products[3] = new Product("plum", 3.25);
        products[4] = new Product("potato", 11.25);

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (i != j) {
                    if (products[i].equals(products[j])) {
                        System.out.println("Product " +(i + 1) +" "+ products[i].toString() + " == Product " + (j + 1) + " " + products[j].toString());


                    }
                }
            }
        }
    }
}




