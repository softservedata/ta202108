package com.softserve.edu09set;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FindDups {
    public static void main(String[] args) {
        /*-
        Set<String> s = new HashSet<>();
        //List<String> s = new LinkedList<>();
        for (int i = 0; i < args.length; i++) {
            if (!s.add(args[i])) {
                System.out.println("Duplicate detected: " + args[i]);
            }
        }
        System.out.println("Elements: " + s);
        */
        /*-
        Set<Employee> s = new HashSet<>();
        //Set<Employee> s = new TreeSet<>(new Employee.ByNameAndId());
        //Set<Employee> s = new TreeSet<>();
        boolean b;
        b = s.add(new Employee(123, "Ivan"));
        System.out.println("s.add(new Employee(123, \"Ivan\")) = " + b);
        b = s.add(new Employee(124, "Petro"));
        System.out.println("s.add(new Employee(124, \"Petro\")) = " + b);
        b = s.add(new Employee(123, "Ivan"));
        System.out.println("s.add(new Employee(123, \"Ivan\")) = " + b);
        //
        b = s.add(null);
        System.out.println("s.add(null) = " + b);
        b = s.add(null);
        System.out.println("s.add(null) = " + b);
        //
        System.out.println("Employee: " + s);
        //
//		for (Employee current : s) {
//			System.out.println("employee: " + current 
//					+ "  hashCode(): " + current.hashCode());
//		}
        //Collections.sort(s); // Error
        Set<Employee> s2 = new HashSet<>();
        s2.add(new Employee(123, "Ivan"));
        s2.add(new Employee(124, "Petro"));
        s2.add(null);
        System.out.println("s.equals(s2) = " + s.equals(s2));
        //
//		for (Employee current : s) {
//			System.out.println("employee: " + current // current.toString()
//					+ "  hashCode(): " + (current != null ? current.hashCode(): null));
//		}
        */
        /*-
        //Set<String> s = new HashSet<>();
        List<String> s = new LinkedList<>();
        for (int i = 0; i < args.length; i++) {
            s.add(args[i]);
        }
        System.out.println("Original Elements: " + s);
        Collections.sort(s);
        //s.sort();
        System.out.println("Sorted Elements: " + s);
        */
        // /*-
        List<Employee> s = new LinkedList<>();
        s.add(new Employee(123, "Ivan"));
        s.add(new Employee(121, "Petro"));
        s.add(new Employee(123, "Ivan"));
        System.out.println("Original Elements: " + s);
        //Collections.sort(s);
        Collections.sort(s, new Employee.ByNameAndId());
        //s.sort(new Employee.ByNameAndId());
        System.out.println("Sorted Elements: " + s);
        // */
        //Set<String> s2 = new HashSet<>();
    }
}
