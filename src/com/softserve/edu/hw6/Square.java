package com.softserve.edu.hw6;

public class Square implements Figure {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(side);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
