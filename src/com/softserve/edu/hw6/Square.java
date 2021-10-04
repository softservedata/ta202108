package com.softserve.edu.hw6;

public class Square implements Figure {

    private static double side;

    public Square(double side) {
        Square.side = side;

    }
    @Override
    public double getPerimetr() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Perimetr of square is = " + side * 4;
    }

}
