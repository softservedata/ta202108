package com.softserve.edu.hw11_hw12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Homework11_12 {

    public static void main(String[] args) throws IOException {
            String content = new String(Files.readAllBytes(Paths.get("Domashkafile.txt")), StandardCharsets.UTF_8);

    String result = content.replaceAll("Welcome", "Hello");
        System.out.println(content);
        System.out.println(result);
        File file = new File("C:\\Users\\VladlenStolpakov\\IdeaProjects\\ta202108\\Domashkafile.txt");
        try(FileWriter writer = new FileWriter(file, false))
        {
            // запись всей строки
            writer.write(result);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
