package com.softserve.edu.hw10;

public class Homework10 {
    public String getCorrectNumber(String number)
    {
        return number.replaceAll("[^0-9]", "");
    }

    public static void main(String[] args) {
        Homework10 hw10=new Homework10();
        String result = hw10.getCorrectNumber("(050)1234567text");
        System.out.println(result);
    }
}
