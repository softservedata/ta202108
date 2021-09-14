package com.softserve.edu.hw7;

public class Square implements Figure{

    private double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return  "Square with " + side + " side" + "                       Perimeter = " + String.format("%.2f", GetPerimeter());
    }

    @Override
    public double GetPerimeter() {
        return side*4;
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
