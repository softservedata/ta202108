package com.softserve.edu.hw8;

import java.util.ArrayList;

public class AppArrayListRemove {

    public static void main(String[] args) {

        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        ArrayList1.add(1);
        ArrayList1.add(2);
        ArrayList1.add(3);
        ArrayList1.add(1);
        ArrayList1.add(2);
        ArrayList1.add(6);
        ArrayList<Integer> ArrayList2 = new ArrayList<>();
        ArrayList2.add(6);
        ArrayList2.add(2);
        ArrayList2.add(5); //different element
        ArrayList2.add(1);
        ArrayList2.add(3);
        ArrayList2.add(2);
        ArrayList2.add(1);
        ArrayList2.add(4); //different element

        for (Integer arrayL1 : ArrayList1) {
            for (int i = 0; i < ArrayList2.size(); i++) {
                if (arrayL1.equals(ArrayList2.get(i))) {
                    ArrayList2.remove(i);
                }
            }
        }

        if (ArrayList2.isEmpty()) {
            System.out.println("Content in both lists is the same");
        }else{
            System.out.println("Content in the lists is not the same");
            System.out.println("Difference is " + ArrayList2);
        }
    }
}
