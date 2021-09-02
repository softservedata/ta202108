package com.softserve.edu.hw4;

public class Homework4 {

	public static void main(String[] args) {
		Product[] product = new Product[5];
		product[0] = new Product("Shampoo A", 10);
		product[1] = new Product("Shampoo B", 20);
		product[2] = new Product("Shampoo C", 30);
		product[3] = new Product("Shampoo B", 20);
		product[4] = new Product("Shampoo A", 10);
		
		for (int i=0; i<product.length; i++)
		for (int j=i+1; j<product.length; j++){
			if (product[i].equals(product[j])) {
				System.out.println(product[i].getName());
			}
		}
	}

}
