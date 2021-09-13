package com.softserve.edu.HW6;

public class Rectangle implements Figure {

    private  double length;
    private  double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }
    @Override
    public String toString() {
        return "Rectangle {" +
                  width *2 +
                  length *2 +
                '}';
    }


}
