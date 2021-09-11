package com.softserve.edu.hw7;

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

    /**
     *
     * @return
     */
    public float getPerimeter() {
        return side1 + side2 + side3;
    }


    /**
     * @param figure
     * @return int
     */
    public int compareTo(Figure figure) {
        return Float.compare(getPerimeter(), figure.getPerimeter());
    }
}
