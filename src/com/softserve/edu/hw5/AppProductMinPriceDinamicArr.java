package com.softserve.edu.hw5;

import com.softserve.edu.hw4.Product;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AppProductMinPriceDinamicArr {

    public static void main (String[] args) {
        Product[] Products;
        ArrayList<Product> CheapProducts;

        System.out.println("Find all cheapest products WITH dynamic array");

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
    private static ArrayList<Product> findMinProductPrice(Product[] Products) {

        ArrayList<Product> CheapProducts = new ArrayList<Product>();         //final array with the cheapest products ready to be printed
        CheapProducts.add(Products[0]);

        for (int i=1; i<Products.length; i++) {           //find the lowest price value
            if (CheapProducts.get(0).getPrice() > Products[i].getPrice()) {
                CheapProducts.clear();
                CheapProducts.add(Products[i]);
            } else {
                if (CheapProducts.get(0).getPrice() == Products[i].getPrice()){
                    CheapProducts.add(Products[i]);
                }
            }
        }

        return CheapProducts;
    }

    //print the cheapest product(s)
    private static void printMinPriceProduct(ArrayList<Product> CheapProducts) {
        if(CheapProducts.size() == 1) {
            System.out.println("The cheapest product is " + CheapProducts.get(0).getName() + " with price = " + CheapProducts.get(0).getPrice());
        }
        else {
            if(CheapProducts.size() > 1){
                System.out.println("The cheapest products are:");
                for(int i = 0; i<CheapProducts.size(); i++){
                    System.out.println("---" + CheapProducts.get(i).getName() + " with price = " + CheapProducts.get(i).getPrice());
                }
            }
            else {
                if(CheapProducts.size() < 1) {
                    System.out.println("Error");
                }
            }
        }
    }
}
