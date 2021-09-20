package com.softserve.edu.HW7;

import com.softserve.edu.HW7.Figure;

public class Triangle implements Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Perimetr of triangle  =" + sideA +
                  sideB +
                  sideC +
                '}';

    }

    @Override
    public int compareTo(Figure o) {
        return Double.compare(getPerimeter(), o.getPerimeter());
    }
}

