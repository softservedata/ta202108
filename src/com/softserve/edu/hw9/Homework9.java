package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework9 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.add(1);


        list2.add(3);
        list2.add(1);
        list2.add(4);
        list2.add(6);

        Collections.sort(list1);
        //System.out.println(list1);

        // System.out.println(list2);
        Collections.sort(list2);

        List<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) { //list1 has 2 elements (i and j)
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                 list3.add(list1.get(i));

                }
            }
        }
        System.out.println(list3);
    }

}

