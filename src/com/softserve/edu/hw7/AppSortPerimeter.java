package com.softserve.edu.hw7;

public class AppSortPerimeter {

    public static void main(String[] args) {

    Figure[] Figures = {
            new Triangle(3.33, 1.23, 8.43),
            new Square(5.66),
            new Triangle(6.2, 7.12, 12.03),
            new Rectangle(10.25, 4.8),
            new Rectangle(10.2, 4.95),
            new Square(8)};

    //findMaxPerimeter(Figures);
        printAllFigures(Figures);
        areFiguresSorted(Figures);


    }

    private static void areFiguresSorted(Figure[] Figures) {

        Figure FigureMaxPerimeter = Figures[0];
        int state = 0, increase = 0, decrease = 0;

        for (int i = 1; i < 6; i++) {
            state = Figures[i].compareTo(Figures[i-1]);
            if (state > 0) {
                increase = increase + 1;
            } else {
                if (state < 0) {
                    decrease = decrease + 1;
                }
            }
        }

        if (increase == 5) {
            System.out.println("\nFigures sorted by Perimeter ascending");
        } else {
            if (decrease == 5) {
                System.out.println("\nFigures sorted by Perimeter descending");
            } else {
                System.out.println("\nFigures aren't sorted by Perimeter");
            }
        }
    }

    private static void printAllFigures(Figure[] Figures) {

        for(int i=0; i<6; i++) {
            System.out.println(Figures[i].toString());
        }
    }
}
