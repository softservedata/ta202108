package com.softserve.edu.hw8;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 1, 1);
        Set<Integer> set1 = new HashSet<>(numbers1);
        Set<Integer> set2 = new HashSet<>(numbers2);
        System.out.println(set1.equals(set2));
        //or
        System.out.println(areTwoListsEqualByTheirContent(numbers1, numbers2));
    }

    // customCrutchMethod
    static <T> boolean areTwoListsEqualByTheirContent(List<T> l1, List<T> l2) {
        List<T> temp1 = new ArrayList<>(l1);
        List<T> temp2 = new ArrayList<>(l2);
        temp1.removeAll(l2);
        temp2.removeAll(l1);
        return !(temp1.size() > 0 || temp2.size() > 0);
    }
}
