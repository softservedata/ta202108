package com.softserve.edu06f;

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = { new Circle(1.2),
                new Circle(1.3),
                new Rectangle(1, 2),
                new Rectangle(2, 3),
                new Circle(1.4),
                new Rectangle(3, 3) };
        double maxArea = -1;
        Figure maxAreafigure = null;
        //
        for (Figure current : figures) {
            double currentArea = current.getArea();
            if (maxArea < currentArea) {
                maxArea = currentArea;
                maxAreafigure = current;
            }
        }
        System.out.println("maxArea = " + maxArea + "  maxAreafigure: " + maxAreafigure);
        //
    }
}
