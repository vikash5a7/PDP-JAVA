package com.epam;

import java.util.Arrays;
import java.util.HashMap;

public class Ana {
	public static void main(String[] args) {
		String s1 = "vikash";
		String s2 = "hsakiv";

		boolean b = isAngram(s1, s2);
		System.out.println("the Value is" + b);

		boolean c = isAngram2(s1, s2);
		System.out.println("the Value is" + b);
	}

	private static boolean isAngram2(String s1, String s2) {

		HashMap<Character, Integer> map = new HashMap<>();

		if (s1.length() != s2.length())
			return false;

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);

			if (map.containsKey(c)) {
				int previousValue = map.get(c);
				map.put(c, previousValue + 1);
			} else {
				map.put(c, 1);
			}

		}

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);

			if (map.containsKey(c)) {
				int previousValue = map.get(c);

				if (previousValue == 1) {
					map.remove(c);
				} else {
					map.put(c, previousValue - 1);
				}
			} else {
				return false;
			}

		}

		return map.isEmpty();
	}

	private static boolean isAngram(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;

		char[] firstValue = s1.toCharArray();
		char[] secondValue = s2.toCharArray();

		Arrays.sort(firstValue);
		Arrays.sort(secondValue);
	

		return Arrays.equals(firstValue, secondValue);
	}
}
