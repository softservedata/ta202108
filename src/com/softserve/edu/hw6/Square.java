package com.softserve.edu.hw6;

public class Square implements Figure {
    private int a;

    public Square(int a) {
        this.a = a;
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
