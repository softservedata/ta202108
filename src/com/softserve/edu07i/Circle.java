package com.softserve.edu07i;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        System.out.println("Run from Circle");
        return (Volumetric.PI * (radius * 2));
    }
    
}