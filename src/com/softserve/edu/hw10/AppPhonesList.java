package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppPhonesList {

    public static void main(String[] args) {

        String InitialText = """
                text +093 987 65 43 text (050)1234567text
                   (067) 21-436-57 text 050-2345678 words 0939182736 words 032224-19-28 text
                   (093)-11-     22-334 text 044 435-62-18 text 044-721-73-45 text""";

        String phoneNumber = "\\+?\\(?(\\d+)\\)?[- ]*(\\d+)[- ]*(\\d+)[- ]*(\\d+)";
        Pattern pattern = Pattern.compile (phoneNumber);
        Matcher matcher = pattern.matcher(InitialText);

        List<String> PhonesList = new ArrayList<>();

        while (matcher.find()) {
            String phone = matcher.group().replaceAll("[\\s+()-]", "");
            PhonesList.add(phone);
        }

        System.out.println(InitialText);
        System.out.println ("Found phone numbers:");
        for (String current:PhonesList) {
            System.out.println (current);
        }
    }
}
