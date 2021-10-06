package com.softserve.edu.hw7;

public class Rectangle implements Figure {
	private int sideA;
	private int sideB;

	public Rectangle(int sideA, int sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public String toString() {
		return "\nRectangle [perimeter=" + perimeter() + "]";
	}

	@Override
	public int perimeter() {
		return (sideA + sideB) * 2;
	}

	@Override
	public int compareTo(Figure figure) {
		return perimeter() - figure.perimeter();
	}
}
