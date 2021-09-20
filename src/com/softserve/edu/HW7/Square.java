package com.softserve.edu.HW7;

import com.softserve.edu.HW7.Figure;

public class Square implements Figure {

    private static double side;


    public Square(double side){
        this.side = side;

    }


    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Perimetr of square is =" + side * 4;
    };

    @Override
    public int compareTo(Figure o) {
        return Double.compare(getPerimeter(), o.getPerimeter());
    }
}

