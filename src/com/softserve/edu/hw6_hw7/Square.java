package com.softserve.edu.hw6_hw7;

public class Square implements Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int compareTo(Figure  figure) {
        return Double.compare( this.getPerimetr(),figure.getPerimetr());
    }

    @Override
    public int getPerimetr() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
