package com.softserve.edu.hw10;

import java.util.regex.*;

public class Appl10 {

	public static void main(String[] args) {
		String text ="   text 093 987 65 43 text (050)1234567text\r\n"
				+ "   (067)21-436-57 text 050-2345678 words 0939182736 words 032224-19-28 text\r\n"
				+ "   (093)-11-22-334 text 044 435-62-18 text 044-721-73-45 text";
		String numberPattern = "[0-9]+";
		
		text = text.replaceAll("([-() ]+)", "");
		
		Pattern p = Pattern.compile(numberPattern);
	    Matcher m = p.matcher(text);
	    
	    while (m.find()) {
	        System.out.print(text.substring(m.start(), m.end()) + "\n");
	  }
	}
}
