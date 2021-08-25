package com.softserve.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HW3 {
    //static private final int counter = 3; //numbers' counter

    public static void main(String[] args) {
        int[] numbers;

        numbers = configArray(); //enter array length
        readNumbers(numbers);    //fill in array of numbers
        sortNumbers(numbers);    //sort entered array of numbers
        printNumbers(numbers);   //print sorted array of numbers
    }

    //array initialization with length entered by user
    public static int[] configArray() {
        int counter; //array length

        System.out.println("How many numbers you'll enter? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            counter = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            counter = 3;
            System.out.println("Oops, something went wrong! Default numbers' counter set up as 3");
        }

        return new int[counter];
    }

    //read all numbers from keyboard and save them to the array
    public static void readNumbers(int[] numbers) {
         for (int i = 0; i<numbers.length; i++) {
            System.out.println("Enter number " + (i+1));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            try {
                numbers[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Oops, something went wrong!");
            }
        }
    }

    //sort array of entered numbers (bubble sorting is used)
    public static void sortNumbers(int[] numbers) {
        int sort;
        int counter = numbers.length;

        for (int j = 0; j<counter-1; j++) {
            for (int i = 0; i<counter-j-1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    sort = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = sort;
                }
            }
        }
    }

    //print sorted array of numbers
    public static void printNumbers(int[] numbers) {
        System.out.println("We've sorted your numbers: ");
        for (int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println("\nEnjoy! ;)");
    }
}
