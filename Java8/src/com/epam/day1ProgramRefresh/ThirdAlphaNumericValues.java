package com.epam.day1ProgramRefresh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdAlphaNumericValues {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("as", "123", "32", "2as");

		List<Integer> output = new ArrayList<>();

		ls.forEach(x -> {
			int input = isNumber(x);
			if (input != -1) {
				output.add(input);
			}
		});
		System.out.println(output);
	}

	/**
	 * 
	 * @param string
	 * @return Integer
	 */
	
	private static int isNumber(String string) {
		try {
			int value = Integer.parseInt(string);
			return value;
		} catch (NumberFormatException e) {
			return -1;
		}
	}
}
