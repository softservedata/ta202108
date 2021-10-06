package com.softserve.edu.hw6;

public class Appl {

	public static void main(String[] args) {
		Figure[] figures = {
				new Rectangle(2, 3),
				new Rectangle(3, 1),
				new Square(2),
				new Triangle(1, 2, 3)
		};
		int maxPerimeter = -1;
		Figure figureWithMaxPerimeter = null;
		
		for(Figure figure: figures) {
			if(figure.perimeter() > maxPerimeter) {
				maxPerimeter = figure.perimeter();
				figureWithMaxPerimeter = figure;
			}
		}
		
		System.out.println(figureWithMaxPerimeter.toString() + ", perimeter: " + maxPerimeter);
	}

}
