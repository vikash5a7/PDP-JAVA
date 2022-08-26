package com.epam;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "DM";

		int number = romanToInt(s);
		System.out.println(number);
	}

	private static int romanToInt(String s) {
		if (s.length() == 0 || s == null)
			return 0;
		Map<Character, Integer> m = new HashMap<>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);

		int result = m.get(s.charAt(s.length() - 1));
		for (int i = s.length() - 2; i >= 0; i--) {
			if (m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {// IV is 4 & VI is 6
				result = result - m.get(s.charAt(i));
			} else {
				result += m.get(s.charAt(i));
			}
		}
		return result;
	}

}
