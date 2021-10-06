package com.softserve.edu.hw6;

public class Rectangle implements Figure {
	private int sideA;
	private int sideB;

	public Rectangle(int sideA, int sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public String toString() {
		return "Rectangle [sideA=" + sideA + ", sideB=" + sideB + "]";
	}
	
	@Override
	public int perimeter() {
		return (sideA + sideB) *2;
	}
}
