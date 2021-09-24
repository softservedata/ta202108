package com.softserve.edu.hw6;

public class Square implements Figure {
    private int storona;

    public Square(int a) {
        this.storona = a;
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
