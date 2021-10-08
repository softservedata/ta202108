package com.softserve.edu.hw11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl11 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String fileNameIn = "src\\com\\softserve\\edu\\hw11\\testWelcome.txt";
		String fileNameOut = "src\\com\\softserve\\edu\\hw11\\testResult.txt";
		String searchWord = "Welcome";
		String changeWord = "Hello";

		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameIn)))) {
			String strLine;
			while ((strLine = br.readLine()) != null) {
//				System.out.println(strLine);
				sb.append(strLine.replace(searchWord, changeWord)).append("\r\n");
			}
		} catch (IOException e) {
			System.out.println("File Read Error: " + fileNameIn);
		}

		try (FileWriter fileWriter = new FileWriter(fileNameOut)) {
			fileWriter.write(sb.toString());
//			System.out.println(sb);
		} catch (IOException e) {
			System.out.println("File Write Error: " + fileNameOut);
		}
	}
}