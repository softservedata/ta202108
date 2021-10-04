package com.softserve.edu.hw6;

public class Triangle implements Figure {

    private double side1;
    private double side2;
    private double side3;
     public Triangle(double side1, double side2, double side3) {
         this.side1 = side1;
         this.side2 = side2;
         this.side3 = side3;
     }

     @Override
    public double getPerimetr() {
         return side1 + side2 + side3;
     }

     @Override
     public String toString() {
         return "Triangle{" +
                 "Perimetr of triangle = " + side1 +
                 side2 +
                 side3 +
                 '}';
     }
}
