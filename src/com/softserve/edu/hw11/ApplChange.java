package com.softserve.edu.hw11;

import java.io.*;

public class ApplChange {
    public static void main(String args[]) {
        try {
            File file = new File("File1.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";
            while ((line = reader.readLine()) != null) {
                oldtext += line + "\r\n";
            }
            reader.close();
            // replace a word in a file
            String newtext = oldtext.replaceAll("Welcome", "Hello");

            FileWriter writer = new FileWriter("file1.txt");
            writer.write(newtext);
            writer.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
