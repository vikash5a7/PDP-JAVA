package com.epam.day1ProgramRefresh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMaximumNumberOfVowels {

	public static void main(String[] args) {
		int max = 0;
		String str1 = "The quick brown fox jumps right over the little lazy dog.";

		String[] str = str1.split(" ");
		Map<String, Integer> m = new HashMap<>();
		for (int i = 0; i < str.length; i++) {

			int countOfVowel = countVowelsAndConsonants(str[i]);
			if (max < countOfVowel) {
				max = countOfVowel;
			}
			m.put(str[i], countOfVowel);
		}

		Iterator<Map.Entry<String, Integer>> itr = m.entrySet().iterator();
		System.out.println(max);
		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			if (entry.getValue() == max) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}

	}

	/**
	 * finding the number of o
	 * @param str
	 * @return
	 */
	public static int countVowelsAndConsonants(String str) {
		
		if (null == str) {
			throw new IllegalArgumentException("Input String cannot be null");
		}

		int VOWELS = (int) str
				.toLowerCase()
				.replaceAll(" ", "")
				.chars()
				.filter(ch -> ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch))
				.count();
		return VOWELS;
	}

}