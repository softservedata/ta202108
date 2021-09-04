package com.softserve.edu.hw6;

public class Rectangle implements Figure {
    float width;
    float length;

    Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public float getPerimeter() {
        return 2 * width + 2 * length;
    }
}
