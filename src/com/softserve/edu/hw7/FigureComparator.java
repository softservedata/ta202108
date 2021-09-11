package com.softserve.edu.hw7;

import java.util.Comparator;

public class FigureComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure figure1, Figure figure2) {
        return figure1.compareTo(figure2);
    }
}
