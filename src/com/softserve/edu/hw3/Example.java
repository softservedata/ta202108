package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[3];
        for (int i = 0; i < 3; i++) {
            try {
            System.out.println("Enter integer: ");
            int myInt = sc.nextInt();
            intArray[i] = myInt;
            } catch (InputMismatchException e) {
                System.out.println("Your input is invalid, please try again");
                i--;
                sc.next();
            }
        }
        Arrays.sort(intArray);
        System.out.println("Array sorted: ");
        System.out.println(Arrays.toString(intArray));

    }
}
