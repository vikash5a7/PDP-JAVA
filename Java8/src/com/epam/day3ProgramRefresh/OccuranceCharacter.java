package com.epam.day3ProgramRefresh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OccuranceCharacter {

	public static void main(String[] args) {
		String input = "organization";
		Occurance(input);
		occuranceWithUsingJava8(input);
	}

	private static void occuranceWithUsingJava8(String input) {
		Map<String, Long> result = Arrays.stream(input.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);
	}

	private static void Occurance(String input) {

		char[] inputChar = input.toCharArray();
		Map<Character, Integer> m = new HashMap<>();

		for (char c : inputChar) {
			int value = 1;
			if (m.containsKey(c)) {
				value = m.get(c) + 1;
			}
			m.put(c, value);
		}
		Set<Character> keySet = m.keySet();
		for (char key : keySet) {
			System.out.println(key + " - " + m.get(key));
		}

	}
}
