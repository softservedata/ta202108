package com.softserve.edu.hw10;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    public static void main(String[] args) {
        List<String> phoneList = new ArrayList<String>();
        String text = "text 093 987 65 43 text (050)1234567text\n" +
                "   (067)21-436-57 text 050-2345678 words 0939182736 words 032224-19-28 text\n" +
                "   (093)-11-22-334 text 044 435-62-18 text 044-721-73-45 text";
        String pattern = "(\\d+[\\s-\\)]*)+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            String cleanedPhone = m.group().replaceAll("[\\s-\\)]+", "");
            phoneList.add(cleanedPhone);
        }
        System.out.println("Phones: ");
        for (String phone : phoneList) {
            System.out.println(phone);
        }
    }
}
