package com.softserve.edu.hw11;

import java.io.*;

public class App {
    public static void main(String[] args) {
        final String path = "src/com/softserve/edu/hw11/text.txt";
        File file = new File(path);

        StringBuilder stringBuilder = new StringBuilder();

        if (file.exists()) {
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String temp;
                while ((temp = reader.readLine()) != null) {
                    stringBuilder.append(temp).append("\n");
                }
                fileWriter = new FileWriter(file);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(
                        stringBuilder
                                .toString()
                                .replaceAll("Welcome", "Hello"));
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
