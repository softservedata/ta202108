package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String text = "te1hdf132hd21adfxt 093 987 65 43 gs12gs " +
                "1211 3gs321g3s2 (050)1234567 text\n" +
                "   (067)21-436-57 text " +
                "050-2345678 fs12fs 12313 " +
                "sdgfs 0939182736 fsfsd" +
                "fsfsfs 032224-19-28 text\n" +
                "   (093)-11-22-334 te123d" +
                "sf32xt 044 435-62-18 text" +
                " 044-721-73-45 1s1fsd23fs56fs6 123 55 s1s 2 3";

        String phoneRegEx = "\\(?([0-9]{3})\\)?([\\s.-]?)([0-9]{2,4})([\\s.-]?)([0-9]{2,4})([\\s.-]?)([0-9]{2,4})";
        Pattern pattern = Pattern.compile(phoneRegEx);
        Matcher matcher = pattern.matcher(text);

        List<String> phones = new ArrayList<>();

        while (matcher.find()) {
            String phone = matcher.group().replaceAll("[\\s()-]", "");
            phones.add(phone);
        }

        phones.forEach(System.out::println);
    }
}
