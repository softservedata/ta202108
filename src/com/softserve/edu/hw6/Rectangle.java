package com.softserve.edu.hw6;

public class Rectangle implements Figure {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        System.out.println("Rectangle " + length + ", " + height);
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        System.out.println("Figure with the biggest perimeter is Rectangle with sides " + length + " and " + height);
        return  "Perimeter = " + String.format("%.2f", Perimeter());
    }

    @Override
    public double Perimeter() {
        return 2 * (height + length);
    }
}
