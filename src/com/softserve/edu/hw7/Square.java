package com.softserve.edu.hw7;


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


    /**
     * @param figure
     * @return int
     */
    public int compareTo(Figure figure) {
        return Float.compare(getPerimeter(), figure.getPerimeter());
    }
}
