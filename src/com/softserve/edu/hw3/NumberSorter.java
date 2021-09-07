package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {
    public static final int AMOUNT_OF_NUMBERS = 3;

    public static void main(String[] args) {
        double[] doubles = new double[AMOUNT_OF_NUMBERS];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < AMOUNT_OF_NUMBERS; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            doubles[i] = scanner.nextDouble();
        }
        scanner.close();

        System.out.println("Output:");
        Arrays.sort(doubles);

        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }
    }
}
