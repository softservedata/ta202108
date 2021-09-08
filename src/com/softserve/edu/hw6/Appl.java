package com.softserve.edu.hw6;

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(5.25, 6.0),
                new Rectangle(13.0, 2.7),
                new Square(3.75),
                new Triangle(2.2, 3.3, 4.4)
        };

        Figure maxPerimeterFigure = null;
        for (Figure figure : figures) {
            if (maxPerimeterFigure == null
                    || figure.getPerimeter() > maxPerimeterFigure.getPerimeter()) {
                maxPerimeterFigure = figure;
            }
        }

        System.out.println(maxPerimeterFigure);
    }
}
