package com.softserve.edu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);

        int a = keybord.nextInt();
        int b = keybord.nextInt();
        int c = keybord.nextInt();

        Integer[] arr = {a, b, c};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}



