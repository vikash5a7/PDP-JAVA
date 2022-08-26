package com.epam;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String vik = "leeltcode";

		System.out.println("First unique: " + firstUniqChar(vik));

	}

	public static int firstUniqChar(String s) {
//		int[] a = new int[26];
//		int l = s.length();
//		for (int i = 0; i < l; i++) {
//			a[s.charAt(i) - 'a']++;
//		}
//		for (int i = 0; i < l; i++) {
//			if (a[s.charAt(i) - 'a'] == 1)
//				return i;
//		}

		System.out.println('s' - 'a');

		int a[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			System.out.println(a[s.charAt(i) - 'a']++);
		}

		System.out.println("-----");

		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			System.out.println(j);

		}

		for (int i = 0; i < s.length(); i++) {

			if (a[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}

	public static int isUnquic(String v) {

		Map<Character, Integer> m = new LinkedHashMap<>();

		for (int i = 0; i < v.length(); i++) {
			char c = v.charAt(i);
			m.put(c, m.containsKey(c) ? m.get(c) + 1 : 1);
		}
		
		m.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();

		return -1;
	}
	
	
	

}
