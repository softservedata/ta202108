package com.softserve.edu.hw7;

public class Square implements Figure {

    private static int side;

    public Square(int side) {
        Square.side = side;

    }
    @Override
    public int getPerimetr() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Perimetr of square is = " + side * 4;
    }
    @Override
    public int compareTo(com.softserve.edu.hw7.Figure figure) {
        return getPerimetr() - figure.getPerimetr();
    }
}
