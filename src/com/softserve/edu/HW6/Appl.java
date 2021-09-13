package com.softserve.edu.HW6;

public class Appl {

    public static void main(String[] args) {

        double maxPerimetr = -1;
        Figure maxPerimeterFigure = null;

        Figure[] figures = {
                new Rectangle(99.9, 8.4),
                new Rectangle(6.1, 9.2),
                new Triangle(33.1, 20.1, 0.1),
                new Square(0.2)};

        for (Figure current : figures) {
            double currentPerimetr = current.getPerimeter();
            if( maxPerimetr < currentPerimetr){
                 maxPerimetr = currentPerimetr;
                 maxPerimeterFigure = current;

            }
        }
        System.out.println("Figure with max perimeter is: " + maxPerimeterFigure);

    }
}




