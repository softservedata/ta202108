package com.softserve.edu.hw6;

public class Appl {

    public static void main(String[] args) {
        double maxPerimetr = -1;
        Figure maxPerimetrFigure = null;

        Figure[] figures = {
                new Rectangle(75.2, 10.1),
                new Rectangle (15.4,20.7),
                new Square (1.1),
                new Triangle (20.2,15.7,31.3)};

        for (Figure current : figures) {
            double currentPerimetr = current.getPerimetr();
            if ( maxPerimetr < currentPerimetr) {
                maxPerimetr = currentPerimetr;
                maxPerimetrFigure = current;
            }
        }
        System.out.println("Figure with max perimetr is: " + maxPerimetrFigure);
    }
}
