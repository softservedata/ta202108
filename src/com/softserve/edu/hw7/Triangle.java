package com.softserve.edu.hw7;

public class Triangle implements Figure {
	private int sideA;
	private int sideB;
	private int sideC;

	public Triangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public String toString() {
		return "\nTriangle  [perimeter=" + perimeter() + "]";
	}

	@Override
	public int perimeter() {
		return sideA + sideB + sideC;
	}

	@Override
	public int compareTo(Figure figure) {
		return perimeter() - figure.perimeter();
	}
}
