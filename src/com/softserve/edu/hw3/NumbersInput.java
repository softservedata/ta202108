package com.softserve.edu.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        int counter = 0;
        while (counter <= 2) {
            try {
                System.out.println("Please enter an integer number.");
                String inputNumberStr = input.nextLine();
                int number = Integer.parseInt(inputNumberStr);
                numbers[counter] = number;
                counter++;
            } catch (NumberFormatException e) {
                System.out.println("You should enter an integer number.");
            }
        }
        input.close();
        System.out.println("Here you are your numbers.");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("The program finished");
        System.exit(0);
    }
}
