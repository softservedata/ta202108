package com.softserve.edu.hw6;

public class Square implements Figure{
	private int sideOne;
	
	public Square(int sideOne) {
		this.sideOne = sideOne;
	}
	
	@Override
	public String toString() {
		return "Square [sideOne=" + sideOne + "]";
	}

	@Override
	public int perimeter() {
		return sideOne * 4;
	}
}
