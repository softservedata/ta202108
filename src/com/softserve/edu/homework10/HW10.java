package com.softserve.edu.homework10;

public class HW10 {
    public String getCorrectPhoneNumber (String phone)
    {
        return phone.replaceAll ("[^0-9]", "");
    }

    public static void main(String[] args) {
        HW10 hw10=new HW10();
        String result = hw10.getCorrectPhoneNumber("(050)1234567text");
        String result2 = hw10.getCorrectPhoneNumber("(067)21-436-57");
        System.out.println(result);
        System.out.println(result2);
    }
}
