package com.softserve.edu.hw6;

import com.softserve.edu.hw4.Product;


public class Appl {
    public static void main(String[] args){

        Figure rectangle1 = new Rectangle(1, 2);
        Figure rectangle2 = new Rectangle(2,3);
        Figure square = new Square(5);
        Figure triangle = new Triangle(1,3,5);

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
    }
}