package com.softserve.edu.hw6;

public class Square implements Figure {
    float side;

    Square(float side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public float getPerimeter() {
        return 4 * side;
    }
}
