package com.softserve.edu.hw6_and_hw7;

public class Rectangle implements Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int compareTo(Figure  figure) {
        return Double.compare( this.getPerimetr(),figure.getPerimetr());
    }

    @Override
    public int getPerimetr() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

