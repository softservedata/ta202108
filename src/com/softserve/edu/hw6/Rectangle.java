package com.softserve.edu.hw6;

public class Rectangle implements Figure {

    private double height;
    private double width;

    public Rectangle(double height, double width) {

        this.height = height;
        this.width = width;
    }

    @Override
        public double getPerimetr() {
            return 2 * (height + width);
        }
    @Override
        public String toString() {
                return "Rectangle {" +
                        width *2 +
                        height *2 +
                        '}';
    }


}
