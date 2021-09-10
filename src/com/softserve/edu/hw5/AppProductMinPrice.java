package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppProductMinPrice {

    public static void main (String[] args) {
        Product[] Products;
        Product[] CheapProducts;

        Products = configProductsArray();     //how many Products you'll need
        readProducts(Products);               //enter products
        CheapProducts = findMinProductPrice(Products);  //find the cheapest product
        printMinPriceProduct(CheapProducts);            //print the cheapest product
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
    private static Product[] findMinProductPrice(Product[] Products) {

        Product minPriceProduct;
        Product[] TempProducts = new Product[Products.length];  //temporary array of the cheapest products
        int imin = 0;
        int j = 0;
        minPriceProduct = Products[imin];

        for (int i=1; i<Products.length; i++) {           //find the lowest price value
            if(minPriceProduct.getPrice() > Products[i].getPrice()) {
                imin = i;
                minPriceProduct = Products[imin];
            }
        }

        TempProducts[0] = minPriceProduct;
        for (int i=1; i<Products.length; i++) {             //find all cheapest products
            if (TempProducts[0].getPrice() == Products[i].getPrice()) {
                if(i != imin){
                    j++;
                    TempProducts[j] = Products[i];
                }
            }
        }

        Product[] CheapProducts = new Product[j+1];         //final array with the cheapest products ready to be printed
        CheapProducts[0] = TempProducts[0];
        for (int i = 0; i<j+1; i++) {
            CheapProducts[i] = TempProducts[i];
        }

        return CheapProducts;
    }

    //print the cheapest product
    private static void printMinPriceProduct(Product[] CheapProducts) {
        if(CheapProducts.length == 1) {
            System.out.println("The cheapest product is " + CheapProducts[0].getName() + " with price = " + CheapProducts[0].getPrice());
        }
        else {
            if(CheapProducts.length > 1){
                System.out.println("The cheapest products are:");
                for(int i = 0; i<CheapProducts.length; i++){
                    System.out.println("---" + CheapProducts[i].getName() + " with price = " + CheapProducts[i].getPrice());
                }
            }
            else {
                if(CheapProducts.length < 1) {
                    System.out.println("Error");
                }
            }
        }
    }
}
