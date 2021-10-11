package com.softserve.edu.hw6_hw7;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args){

        Rectangle rectangle1 = new Rectangle(5, 3);
        Rectangle rectangle2 = new Rectangle(4,7);
        Square square = new Square(2);
        Triangle triangle = new Triangle(3,5,5);

        Figure [] allFigures=new Figure[4];
        allFigures [0]= rectangle1;
        allFigures [1]= rectangle2;
        allFigures [2]= square;
        allFigures [3]= triangle;

        int max = 0;
        Figure figureWithMaxPerimetr = null;
        for (Figure figure : allFigures){
            if (figure.getPerimetr()>max)
            {
                max= figure.getPerimetr();
                figureWithMaxPerimetr =figure;
            }
        }
        System.out.println(figureWithMaxPerimetr);
        Arrays.sort(allFigures);
        for(Figure figure: allFigures){
            System.out.println(figure);
        }
    }
}
