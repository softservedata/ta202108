package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();

        firstList.add(15);
        firstList.add(11);
        firstList.add(12);
        firstList.add(10);

        List<Integer> secondList = new ArrayList<>();

        secondList.add(10);
        secondList.add(16);
        secondList.add(12);
        secondList.add(11);

        Collections.sort(firstList);
        Collections.sort(secondList);

        List<Integer> commonList = new ArrayList<>();

        for (Integer integer : firstList) {
            for (Integer value : secondList) {
                if (integer.equals(value)) {
                    commonList.add(integer);
                }
            }
        }
        System.out.println(commonList);

    }
}
