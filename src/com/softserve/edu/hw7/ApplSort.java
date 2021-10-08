package com.softserve.edu.hw7;

import java.util.Arrays;

public class ApplSort {

    public static void main(String[] args) {

        Figure[] figures = {
                new Rectangle(5, 8),
                new Square(10),
                new Triangle(2, 4, 8),
                new Square(11),
                new Rectangle(5, 6)};

        for (Figure current : figures) {
            System.out.println("perimetr = " + current.getPerimetr());
        }

        boolean sorted = false;
        for (int i = 0; i < figures.length - 1; i++) {
            if (figures[i].compareTo(figures[i + 1]) <= 0) {
                sorted = true;
            } else {
                System.out.println("Figures are not sorted in ascending order");
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Figures are sorted in ascending order");
        }

    }
}
