package com.entrycode;

import java.util.*;

public class LetterMaps {
	
	public static void checker(String spring) {
		Map<String,Integer> letters = new HashMap<>();
		letters.put("l", 1);
		letters.put("o", 2);
		letters.put("i", 3);
		letters.put("p", 4);
		for(int i=0;i<spring.length();i++) {
			String cha=spring.charAt(i)+"";
			System.out.println(letters.get(cha.toLowerCase()));
		}
	}

	public static void main(String[] args) {
		String candy = "lollipop";
		checker(candy);
	}

}
