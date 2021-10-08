package com.softserve.edu.hw7;

public class Rectangle implements Figure {

    private int length;
    private int height;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }
    @Override
    public String toString() {
        return  "Rectangle {" + 2 * length + 2 * height + "}";
    }

    @Override
    public int getPerimetr() {
        return 2 * (height + length);
    }
    
    @Override
    public int compareTo(Figure figure) {
        return getPerimetr() - figure.getPerimetr();
    }
}
