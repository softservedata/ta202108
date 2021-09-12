package com.softserve.edu.hw4;

import java.util.ArrayList;

public class appProduct {
    public static void main(String[] args) {
        Product pn1 = new Product ("Book", 100);
        Product pn2 = new Product ("Note book", 50);
        Product pn3 = new Product ("Book", 100);
        Product pn4 = new Product ("Pen", 10);
        Product pn5 = new Product ("Pen", 15);

        ArrayList<Product> products = new ArrayList<>(); // add products to List
        products.add(pn1);
        products.add(pn2);
        products.add(pn3);
        products.add(pn4);
        products.add(pn5);

        for (int i=0; i<products.size(); i++)
        {
            for (int j=i+1; j<products.size(); j++ )
            {
                if (products.get(i).equals(products.get(j)))
                {
                    System.out.println(products.get(i));
                }
            }
        }

    }
}
