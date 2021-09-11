package com.softserve.edu.hw7;


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

    /**
     * @param figure
     * @return int
     */
    public int compareTo(Figure figure) {
        return Float.compare(getPerimeter(), figure.getPerimeter());
    }
}
