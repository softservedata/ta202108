package com.softserve.edu.hw7;

public class Triangle implements Figure{

    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return  "Triangle with sides " + sideA + ", " + sideB + " and " + sideC + "    Perimeter = " + String.format("%.2f", GetPerimeter());
    }

    @Override
    public double GetPerimeter() {
        return (sideA+sideB+sideC);
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
