package com.softserve.edu.hw7;

public class Square implements Figure {
	private int sideOne;

	public Square(int sideOne) {
		this.sideOne = sideOne;
	}

	@Override
	public String toString() {
		return "\nSquare    [perimeter=" + perimeter() + "]";
	}

	@Override
	public int perimeter() {
		return sideOne * 4;
	}

	@Override
	public int compareTo(Figure figure) {
		return perimeter() - figure.perimeter();
	}
}
