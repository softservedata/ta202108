package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Appl8 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 1, 2, 3);
		List<Integer> list2 = Arrays.asList(1, 3, 3, 2, 1, 1, 1, 2, 2, 3, 3);

		// method1: with .removeAll
		List<Integer> different1 = new ArrayList<Integer>(list1);
		List<Integer> different2 = new ArrayList<Integer>(list2);

		different1.removeAll(list2);
		different2.removeAll(list1);
		if (different1.size() == 0 && different2.size() == 0) {
			System.out.println("method1: equal content!");
		} else {
			System.out.println("method1: NOT equal content");
		}

		// method2: with HashSet
		Set<Integer> listSet1 = new HashSet<Integer>(list1);
		Set<Integer> listSet2 = new HashSet<Integer>(list2);

		if (listSet1.equals(listSet2)) {
			System.out.println("method2: equal content!");
		} else {
			System.out.println("method2: NOT equal content");
		}
	}
}
