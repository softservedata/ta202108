package com.softserve.edu.hw6;

public class AppMaxPerimeter {

    public static void main(String[] args) {

    Figure[] Figures = {new Rectangle(10.25, 4.8),
                        new Rectangle(10.2, 4.95),
                        new Square(5.66),
                        new Triangle(6.2, 7.12, 12.03)};

    //findMaxPerimeter(Figures);
    printFigureMaxPerimeter(findFigureMaxPerimeter(Figures));


    }

    private static Figure findFigureMaxPerimeter(Figure[] Figures) {

        Figure FigureMaxPerimeter = Figures[0];

        for (Figure figure : Figures) {
            if (FigureMaxPerimeter.Perimeter() < figure.Perimeter()) {
                FigureMaxPerimeter = figure;
            }
        }

        return FigureMaxPerimeter;
    }

    private static void printFigureMaxPerimeter(Figure FigureMaxPerimeter) {

        System.out.println(FigureMaxPerimeter.toString());

    }
}
