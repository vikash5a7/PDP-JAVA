package com.epam.day2ProgramRefresh;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		String input = "lin$pa&wS";
		reverse(input);
		reverseUsingEight(input);
		reverse1(input);
	}

	private static void reverseUsingEight(String input) {
		
	

	}

	private static void reverse(String line) {
		String regex = "[^a-zA-Z]";
		char[] line2 = new StringBuilder(line.replaceAll(regex, "")).reverse().toString().toCharArray();
		char[] line1 = line.toCharArray();
		int i = 0;
		int j = 0;
		while (i < line1.length) {
			if (Character.isAlphabetic(line1[i])) {
				line1[i] = line2[j];
				j++;
			}
			i++;
		}
		System.out.println(String.valueOf(line1));
	}

	private static void reverse1(String input) {
		String pattern = "[^a-zA-Z]";
		char[] charArray = new StringBuilder(input.replaceAll(pattern, "")).reverse().toString().toCharArray();
		char[] line1 = input.toCharArray();

		int i = 0;
		int j = 0;

		while (i < line1.length) {
			if (Character.isAlphabetic(line1[i])) {
				line1[i] = charArray[j];
				j++;
			}
			i++;
		}
		System.out.println(String.valueOf(line1));

	}
}
