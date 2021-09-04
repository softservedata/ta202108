package com.softserve.edu.hw6;

public class Triangle implements Figure {
    float side1;
    float side2;
    float side3;

    Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public float getPerimeter() {
        return side1 + side2 + side3;
    }
}
