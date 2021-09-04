package com.softserve.edu.hw6;


public class Appl {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Rectangle(3, 5.6f);
        figures[1] = new Rectangle(45, 55.6f);
        figures[2] = new Square(12);
        figures[3] = new Triangle(4, 6, 69);

        Figure maxPerimeterFigure = figures[0];
        float maxPerimeter = maxPerimeterFigure.getPerimeter();
        for (Figure figure : figures) {
            if (figure.getPerimeter() > maxPerimeter) {
                maxPerimeter = figure.getPerimeter();
                maxPerimeterFigure = figure;
            }
        }
        System.out.println("Figure with max perimeter is: " + maxPerimeterFigure);
    }
}
