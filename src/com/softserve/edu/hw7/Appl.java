package com.softserve.edu.hw7;

import java.util.Arrays;

public class Appl {

	public static void main(String[] args) {
		Figure[] figures = {
				new Rectangle(2, 3),
				new Rectangle(3, 4),
				new Square(4),
				new Square(5),
				new Triangle(3, 7, 1),
				new Triangle(7, 9, 15) };
		
		System.out.println("Array = " + Arrays.toString(figures));

		boolean sorted = false;
		for (int i = 0; i < figures.length - 1; i++) {
			if (figures[i].compareTo(figures[i + 1]) <= 0) {
				sorted = true;
			} else {
				System.out.println("figures are NOT sorted in ascending order");
				sorted = false;
				break;
			}
		}
		if (sorted) {
			System.out.println("YES! figures are sorted in ascending order");
		}
	}
}
