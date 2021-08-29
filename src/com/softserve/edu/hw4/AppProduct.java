package com.softserve.edu.hw4;

public class AppProduct {

    public static void main (String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product("apple", 20.25);
        products[1] = new Product("apple", 20);
        products[2] = new Product("apple", 20.25);
        products[3] = new Product("appl", 20.25);
        products[4] = new Product("apple", 20);

        for (int i=0; i<5; i++){
            for (int j=i; j<5; j++) {
                if (i!=j){
                         if (products[i].equals(products[j])) {
                            System.out.println("Product" + (i+1) + " == Product" + (j+1));
                         } /*else {
                            System.out.println("Product" + (i+1) + " != Product" + (j+1));
                         }*/
                    }
            }
        }
    }
}
