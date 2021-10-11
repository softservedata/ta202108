package com.softserve.edu.hw8;

import java.util.ArrayList;

public class AppArrayListRemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        ArrayList1.add(1);
        ArrayList1.add(2);
        ArrayList1.add(3);
        ArrayList1.add(1);
        ArrayList1.add(5);
        ArrayList1.add(6);
        ArrayList<Integer> ArrayList2 = new ArrayList<>();
        ArrayList2.add(6);
        ArrayList2.add(2);
        ArrayList2.add(5);
        ArrayList2.add(1);
        ArrayList2.add(3);
        ArrayList2.add(2);
        ArrayList2.add(1);
        ArrayList2.add(4); //different element

        //ArrayList1.removeAll(ArrayList2);
        ArrayList2.removeAll(ArrayList1);

        if (ArrayList2.isEmpty()) {
            System.out.println("Content in both lists is the same");
        }else{
            System.out.println("Content in the lists is not the same");
        }
    }
}
