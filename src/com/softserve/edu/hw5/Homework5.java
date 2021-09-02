package com.softserve.edu.hw5;

import java.util.Arrays;

import com.softserve.edu.hw4.Product;

public class Homework5 {

	public static void main(String[] args) {
		Product[] product = new Product[10];
		product[0] = new Product("Shampoo A", 10);
		product[1] = new Product("Shampoo M", 55);
		product[2] = new Product("Shampoo C", 30);
		product[3] = new Product("Shampoo L", 80);
		product[4] = new Product("Shampoo K", 75);
		product[5] = new Product("Shampoo D", 25);
		product[6] = new Product("Shampoo F", 50);
		product[7] = new Product("Shampoo J", 45);
		product[8] = new Product("Shampoo E", 5);
		product[9] = new Product("Shampoo G", 100);
		
		//#1 "brute force"
		int minPrice = product[0].getPrice();
		String nameMinPrice = product[0].getName();
		for (int i=0; i<product.length; i++) {
			if (product[i].getPrice() < minPrice) {
				minPrice = product[i].getPrice();
				nameMinPrice = product[i].getName();
				}
		}
		System.out.println("#1. min price: " + minPrice + " -> " + nameMinPrice);

		//#2 using the standard array method
		int[] productPrice = new int[product.length];
		for (int i=0; i<product.length; i++) {
			productPrice[i] = product[i].getPrice();
		}
		int min = Arrays.stream(productPrice).min().getAsInt();
		System.out.println("#2. min price: " + min);
	}

}
