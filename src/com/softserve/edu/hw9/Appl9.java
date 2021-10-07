package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Appl9 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(8, 2, 5, 9, 4, 3, 13);
		List<Integer> list2 = Arrays.asList(1, 3, 6, 2, 1, 0, 7, 4, 11, 8, 5);
		
		Set<Integer> listSet1 = new HashSet<Integer>(list1);
		Set<Integer> listSet2 = new HashSet<Integer>(list2);
		
		listSet1.retainAll(listSet2);
		
		List<Integer> resultList = new ArrayList<Integer>(listSet1);
		
		System.out.println("mutual elements: " + resultList);

	}

}
