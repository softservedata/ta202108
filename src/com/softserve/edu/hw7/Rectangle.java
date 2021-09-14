package com.softserve.edu.hw7;

public class Rectangle implements Figure {

    private double length;
    private double height;

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return  "Rectangle with sides " + length + " and " + height + "         Perimeter = " + String.format("%.2f", GetPerimeter());
    }

    @Override
    public double GetPerimeter() {
        return 2 * (height + length);
    }

    @Override
    public int compareTo(Figure figure) {

        int status = 0;

        if ((GetPerimeter() - figure.GetPerimeter()) > 0) {
            status = 1;
        } else {
            if ((GetPerimeter() - figure.GetPerimeter()) < 0) {
                status = -1;
            }
        }

        return status;
    }
}
