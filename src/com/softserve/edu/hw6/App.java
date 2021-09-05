package com.softserve.edu.hw6;

public class App {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Rectangle(20.2, 10.5),
                new Rectangle(11.9, 18.8),
                new Square(6.3),
                new Triangle(5.5, 8.8, 9.5)
        };

        double maxPerimeter = figures[0].calculatePerimeter();
        Figure largestFigure = figures[0];

        for (Figure figure : figures) {
            if (figure.calculatePerimeter() > largestFigure.calculatePerimeter()) {
                largestFigure = figure;
            }
        }

        System.out.println(largestFigure);
    }
}
