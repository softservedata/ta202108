package com.softserve.edu.hw7;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Object[] figures = new Object[]{
                new Rectangle(12.2, 15.5),
                new Rectangle(12, 15),
                new Square(6.3),
                new Square(5),
                new Triangle(5.5, 8.8, 9.5),
                new Triangle(5, 8, 9)
        };

//        Runtime Error (ClassCastException) as Triangle doesn't implement the Comparable interface
//        Arrays.sort(figures);
//        System.out.println(Arrays.toString(figures));

        // Solution -> to pass as an argument the anonymous class of Comparator into the Arrays.sort method
        Arrays.sort(figures, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                double perimeter1;
                double perimeter2;
                if (o1 instanceof Figure) {
                    perimeter1 = ((Figure) o1).calculatePerimeter();
                } else {
                    perimeter1 = ((Triangle) o1).calculatePerimeter();
                }
                if (o2 instanceof Figure) {
                    perimeter2 = ((Figure) o2).calculatePerimeter();
                } else {
                    perimeter2 = ((Triangle) o2).calculatePerimeter();
                }
                return (int) Math.ceil(perimeter1 - perimeter2);
            }
        });
        for (Object figure : figures) {
            System.out.println(figure);
        }
    }
}
