package com.softserve.edu.hw6;

public class Triangle implements Figure{

    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        System.out.println("Triangle " + sideA + ", " + sideB + ", " + sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        System.out.println("Figure with the biggest perimeter is Triangle with sides " + sideA + ", " + sideB + " and " + sideC);
        return  "Perimeter = " + String.format("%.2f", GetPerimeter());
    }

    @Override
    public double GetPerimeter() {
        return (sideA+sideB+sideC);
    }
}
