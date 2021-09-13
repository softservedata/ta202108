package com.softserve.edu.hw6;

public class Square implements Figure{

    private double side;

    public Square(double side) {
        System.out.println("Square " + side);
        this.side = side;
    }

    @Override
    public String toString() {
        System.out.println("Figure with the biggest perimeter is Square with " + side + " side");
        return  "Perimeter = " + String.format("%.2f", GetPerimeter());
    }

    @Override
    public double GetPerimeter() {
        return side*4;
    }
}
