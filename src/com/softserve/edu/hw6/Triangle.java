package com.softserve.edu.hw6;

public class Triangle implements Figure{
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
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}

	@Override
	public int perimeter() {
		return sideA + sideB + sideC;
	}
}
