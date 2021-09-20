package com.softserve.edu.hw9;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(44, 1, 2, 1, 2, 17, 3, 7);
        List<Integer> secondList = Arrays.asList(3, 3, 88, 2, 7, 7, 7, 2, 1, 1, 45);

        Set<Integer> firstSet = new HashSet<Integer>(firstList);
        Set<Integer> secondSet = new HashSet<Integer>(secondList);
        firstSet.retainAll(secondSet);

        Integer[] result = firstSet.toArray(new Integer[firstSet.size()]);

        System.out.println("Intersection of arrays: ");
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
