package com.softserve.edu.HW8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HW8 {

    public static void main(String[] args) {

        List<Integer> listOne = Arrays.asList(1, 2, 1, 2, 3, 7,8);
        List<Integer> listTwo = Arrays.asList(2, 2, 3, 7, 3, 2, 1, 1);



        HashSet<Integer> firstHashSet = new HashSet<Integer>(listOne);
        HashSet<Integer> secondHashSet = new HashSet<Integer>(listTwo);

        if (firstHashSet.equals(secondHashSet)) {
            System.out.println("Lists are equal");
        } else {
            System.out.println("Lists are not equal");
        }
    }
}


