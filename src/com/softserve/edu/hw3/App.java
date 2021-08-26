package com.softserve.edu.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("number1 = ");
        int number1 = Integer.parseInt(br.readLine());
        System.out.print("number2 = ");
        int number2 = Integer.parseInt(br.readLine());
        System.out.print("number3 = ");
        int number3 = Integer.parseInt(br.readLine());
        if (number1 < number2) {
            if (number2 < number3) System.out.println(number1 + " " + number2 + " " + number3);
            else System.out.println(number1 + " " + number3 + " " + number2);
        } else if (number2 < number3) {
            if (number3 < number1) System.out.println(number2 + " " + number3 + " " + number1);
            else System.out.println(number2 + " " + number1 + " " + number3);
        } else if (number3 < number1) {
            if (number1 < number2) System.out.println(number3 + " " + number1 + " " + number2);
            else System.out.println(number3 + " " + number2 + " " + number1);
        }
    }
}
