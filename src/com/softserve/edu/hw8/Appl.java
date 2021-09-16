package com.softserve.edu.hw8;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(1, 2, 1, 2, 3, 7);
        List<Integer> secondList = Arrays.asList(3, 3, 2, 7, 7, 7, 2, 1, 1);

        Collections.sort(firstList);
        Collections.sort(secondList);

        HashSet<Integer> firstHashSet = new HashSet<Integer>(firstList);
        HashSet<Integer> secondHashSet = new HashSet<Integer>(secondList);

        if (firstHashSet.equals(secondHashSet)) {
            System.out.println("Lists are equal!");
        } else {
            System.out.println("Lists are NOT equal!");
        }
    }
}
