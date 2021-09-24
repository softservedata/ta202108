package com.softserve.edu.hw6_and_hw7;

public class Square implements Figure {
    private int storona;

    public Square(int a) {
        this.storona = a;
    }

    public int compareTo(Figure  figure) {
        return Double.compare( this.getPerimetr(),figure.getPerimetr());
    }

    @Override
    public int getPerimetr() {
        return 4 * storona;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + storona +
                '}';
    }
}
