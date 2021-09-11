package com.softserve.edu.hw7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        List<Figure> figures = Arrays.asList(
                new Rectangle(3, 5.6f),
                new Rectangle(45, 55.6f),
                new Square(12),
                new Triangle(4, 6, 69)
        );

        Collections.sort(figures, new FigureComparator());
        for (Figure figure : figures) {
            System.out.println("Figure perimeter is: " + figure.getPerimeter());
        }
    }
}
