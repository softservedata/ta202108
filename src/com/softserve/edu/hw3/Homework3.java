package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework3 {

	static int a1 = 0;
	static int a2 = 0;
	static int a3 = 0;
	
	public static void main(String[] args) throws IOException {
		enterNumbers();
		sortedWithoutArray();		
	}
	
	public static void enterNumbers( ) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter a1: ");
		a1 = Integer.parseInt(br.readLine());
		System.out.print("enter a2: ");
		a2 = Integer.parseInt(br.readLine());
		System.out.print("enter a3: ");
		a3 = Integer.parseInt(br.readLine());
	}
	
	public static void sortedWithoutArray() {
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int c = 0;
		
		if (a1>a2) {s1 = a1; s2 = a2;} else {s1 = a2; s2 = a1;}
		if (a3>s2) {s3 = s2; s2 = a3;} else {s3 = a3;}
		if (s2>s1) {c = s2;	s2 = s1; s1 = c;}
		System.out.println("sorted without array: " + s1 + " "+ s2 + " "+ s3);
	}

}
