package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework8 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(2);
        list2.add(1);
        list2.add(1);

        //System.out.println(list1);
        Collections.sort(list1);
        //System.out.println(list1);

       // System.out.println(list2);
        Collections.sort(list2);
        //System.out.println(list2);

        for (int i = 0; i < list1.size(); i++) { //list1 has 2 elements (i and j)
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i).equals(list1.get(j))) {
                    list1.remove(j);

                }
            }
        }

        for (int i = 0; i < list2.size(); i++) {  //list2 has 2 elements (i and j), we use two FORs
            for (int j = i + 1; j < list2.size(); j++) {
                if (list2.get(i).equals(list2.get(j))) {
                    list2.remove(j);

                }
            }
        }
        System.out.println(list1.equals(list2));


    }
}

