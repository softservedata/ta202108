package com.softserve.edu.hw8;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<> (); // create first ArrayList
        firstList.add (2);
        firstList.add (1);
        firstList.add (4);
        firstList.add (3);
        firstList.add (1);

        List<Integer> secondList = new ArrayList<> (); // create second ArayList
        secondList.add (4);
        secondList.add (1);
        secondList.add (2);
        secondList.add (3);
        secondList.add (2);
        secondList.add (3);

        HashSet<Integer> firstHashSet = new HashSet<>(firstList); // convert first ArrayList to hashSet
        HashSet<Integer> secondHashSet = new HashSet<>(secondList); // convert second ArrayList to hashSet

        if (firstHashSet.equals(secondHashSet)) { //compare two HashSets
            System.out.println("Lists are equal");
        }
        else {
            System.out.println("Lists are not equal");
        }

    }
}
