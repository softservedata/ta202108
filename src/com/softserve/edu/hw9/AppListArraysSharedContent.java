package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.List;

public class AppListArraysSharedContent {

    public static void main(String[] args) {

        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        ArrayList1.add(1);
        ArrayList1.add(2);
        ArrayList1.add(3);
        ArrayList1.add(1);
        ArrayList1.add(9);
        ArrayList1.add(6);
        ArrayList1.add(3);
        ArrayList1.add(1);
        ArrayList1.add(9);
        ArrayList1.add(6);
        ArrayList<Integer> ArrayList2 = new ArrayList<>();
        ArrayList2.add(6);
        ArrayList2.add(2);
        ArrayList2.add(9);
        ArrayList2.add(1);
        ArrayList2.add(4);
        ArrayList2.add(5);
        ArrayList2.add(9);
        ArrayList2.add(1);

        List<Integer> SharedContent = new ArrayList<>();

        for (int i = 0; i < ArrayList1.size(); i++) {
               if(ArrayList2.contains(ArrayList1.get(i))){
                    SharedContent.add(ArrayList1.get(i));
                    for (int j = 0; j < ArrayList2.size(); j++) {
                        if (ArrayList1.get(i).equals(ArrayList2.get(j))){
                            ArrayList2.remove(j);
                            break;
                        }
                    }

                }
        }

        System.out.println("Shared elements of both lists are " + SharedContent);
    }
}
