package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class AppArrayListsHash {

    public static void main(String[] args) {

    ArrayList<Integer> ArrayList1 = new ArrayList<>();
        ArrayList1.add(1);
        ArrayList1.add(2);
        ArrayList1.add(3);
        ArrayList1.add(4);
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
        ArrayList2.add(4);

    Set<Integer> ArrayList1Content = new TreeSet<>(ArrayList1);
    Set<Integer> ArrayList2Content = new TreeSet<>(ArrayList2);

    if (ArrayList1Content.equals(ArrayList2Content)) {
            System.out.println("Content in both lists is the same = " + ArrayList1Content);
    }else{
            System.out.println("Content in the lists is not the same");
            System.out.println("1st list content " + ArrayList1Content);
            System.out.println("2nd list content " + ArrayList2Content);
        }
    }

}
