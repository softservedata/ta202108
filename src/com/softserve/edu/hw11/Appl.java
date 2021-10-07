package com.softserve.edu.hw11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
    public static void main(String[] args) {
        try {
            File inFile = null;
            if (0 < args.length) {
                inFile = new File(args[0]);
            } else {
                System.err.println("Please specify file path:" + args.length);
                System.exit(0);
            }
            String currentLine;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inFile));
            System.out.println(String.format("File content after replaced %s to %s", "Welcome", "Hello"));
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine.replaceAll("Welcome", "Hello"));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
