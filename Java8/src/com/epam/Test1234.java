package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Test1234 {

	public static void main(String[] args) {
		List<String> pangrams = new ArrayList<>();
		pangrams.add("we promptly judged antique ivory buckles for the next prize");
		pangrams.add("we promptly judged antique ivory buckles for the prizes");
		pangrams.add("the quick brown fox jumps over the lazy dog");
		pangrams.add("the quick brown fox jump over the lazy dog ");
		String test = isPangram(pangrams);
		System.out.println("ANswer : " + test);
	}

	private static String isPangram(List<String> pangrams) {
		String finalValue = "";
		for (String value : pangrams) {
			int isAvailable = 1;
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (!value.contains(ch + "")) {
					isAvailable = 0;
					break;
				}
			}
			finalValue += isAvailable;
		}
		return finalValue;
	}
}