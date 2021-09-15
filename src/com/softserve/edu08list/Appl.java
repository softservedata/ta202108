package com.softserve.edu08list;

import java.util.LinkedList;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        //List<Integer> arr = new ArrayList<>();
        List<Integer> arr = new LinkedList<>();
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        System.out.println("arr = " + arr); // .toString()
        arr.add(1, 15);
        System.out.println("arr = " + arr);
        arr.set(1, 16);
        System.out.println("arr = " + arr);
        System.out.println("arr[1] = " + arr.get(1));
    }
}
