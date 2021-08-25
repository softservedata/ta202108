package com.softserve.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HW3 {
    static private final int counter = 3;

    public static void main(String[] args) {
        int[] mass;

        mass = readNumber();
        sortNumbers(mass);
        printNumber(mass);
    }

    public static int[] readNumber() {
        int[] numbers = new int[counter];

        for (int i = 0; i<counter; i++) {
            System.out.println("Enter number " + (i+1));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                numbers[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Oops, something went wrong!");
            }
        }

        return numbers;
    }

    public static int[] sortNumbers(int[] sortedNumbers) {
        int sort;

        for (int j = 1; j<counter; j++) {
            for (int i = 0; i<counter-j; i++) {
                if (sortedNumbers[i] > sortedNumbers[i + 1]) {
                     sort = sortedNumbers[i];
                     sortedNumbers[i] = sortedNumbers[i + 1];
                     sortedNumbers[i + 1] = sort;
            }
        }
        }

        return sortedNumbers;
    }

    public static void printNumber(int[] numbers) {
        for (int i = 0; i<counter; i++) {
            System.out.print(numbers[i] + "  ");
        }
    }
}
