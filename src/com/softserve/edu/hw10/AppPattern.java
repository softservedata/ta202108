package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppPattern {
    public static void main(String[] args) {
        String text = "text 093 987 65 43 text (050)1234567text\n" +
                "   (067)21-436-57 text 050-2345678 words 0939182736 words 032224-19-28 text\n" +
                "   (093)-11-22-334 text 044 435-62-18 text 044-721-73-45 text";
        String text1 = text.trim();
        String phoneNumber = "(\\d+[\\s-)]*)+";
        Pattern p = Pattern.compile (phoneNumber);
        Matcher m = p.matcher(text1);

        List<String> phones = new ArrayList<>();

        while (m.find()) {
            String phone = m.group().replaceAll("[\\s()-]", "");
            phones.add(phone);
        }
        System.out.println ("Phones:");
        for (String current:phones) {
            System.out.println (current);
        }


    }
}
