package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework8 {
    public static void main(String[] args) {

        List<Integer> listFirst = new ArrayList<>();
        List<Integer> listSecond = new ArrayList<>();
        listFirst.add(1);
        listFirst.add(2);
        listFirst.add(1);
        listFirst.add(2);
        listFirst.add(3);

        listSecond.add(3);
        listSecond.add(3);
        listSecond.add(2);
        listSecond.add(2);
        listSecond.add(1);
        listSecond.add(1);

        Collections.sort(listFirst);

        Collections.sort(listSecond);

        for (int i = 0; i < listFirst.size(); i++) { //listFirst has 2 elements (i and j)
            for (int j = i + 1; j < listFirst.size(); j++) {
                if (listFirst.get(i).equals(listFirst.get(j))) {
                    listFirst.remove(j);

                }
            }
        }

        for (int i = 0; i < listSecond.size(); i++) {  //listSecond has 2 elements (i and j), we use two FORs
            for (int j = i + 1; j < listSecond.size(); j++) {
                if (listSecond.get(i).equals(listSecond.get(j))) {
                    listSecond.remove(j);

                }
            }
        }
        System.out.println(listFirst.equals(listSecond));


    }
}