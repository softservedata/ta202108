package com.softserve.edu.HW7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Appl {

    public static void main(String[] args) {

        double maxPerimetr = -1;
        Figure maxPerimeterFigure = null;

        List<Figure> figures = Arrays.asList(
                new Rectangle(99.9, 8.4),
                new Rectangle(6.1, 9.2),
                new Triangle(33.1, 20.1, 0.1),
                new Square(0.2));

        Collections.sort(figures, new FigureComparator());

        for (Figure figure : figures) {
            System.out.println("Figure perimetr: " + figure.getPerimeter());
        }
        System.out.println("Figure with max perimeter is: " + figures.get(figures.size() - 1));

    }
}




