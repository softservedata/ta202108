package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppProductMinPrice {

    public static void main (String[] args) {
        Product[] Products;
        Product min = new Product();

        Products = configProductsArray();     //how many Products you'll need
        readProducts(Products);               //enter products
        min = findMinProductPrice(Products);  //find the cheapest product
        printMinPriceProduct(min);            //print the cheapest product
    }

    //how many Products you'll need
    private static Product[] configProductsArray() {
        int counter; //products array length

        System.out.println("How many Products you'll need? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            counter = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            counter = 10;
            System.out.println("Oops, something went wrong! Default numbers' counter set up as 10");
        }

        return new Product[counter];
    }

    //enter products
    private static void readProducts(Product[] Products) {
        for (int i=0; i<Products.length; i++) {
            Products[i] = new Product();
            System.out.println("Enter Product" + (i+1));
            Scanner in = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.println("Name");
                Products[i].setName(in.nextLine());
            } catch (Exception e){
                Products[i] = new Product("Apple");
                System.out.println("Oops, something went wrong! Default product' is apple");
                //System.out.println(e.getMessage());
            }

            try {
                System.out.println("Price");
                Products[i].setPrice(Double.parseDouble(br.readLine()));
            } catch (Exception e){
                Products[i] = new Product(75.25);
                System.out.println("Oops, something went wrong! Default price is 75.25");
            }
        }
    }

    //find the cheapest product
    private static Product findMinProductPrice(Product[] Products) {
        Product min = new Product();
        int imin = 0;
        min = Products[imin];

        for (int i=0; i<Products.length; i++) {
            if(Products[i].getPrice() < Products[imin].getPrice()) {
                imin = i;
                min = Products[i];
            }
        }
        return min;
    }

    //print the cheapest product
    private static void printMinPriceProduct(Product min) {
        System.out.println("The cheapest product is " + min.getName() + " with price = " + min.getPrice());
    }

}
