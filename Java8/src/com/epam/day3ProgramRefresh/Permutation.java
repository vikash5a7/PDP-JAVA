package com.epam.day3ProgramRefresh;

public class Permutation {

	public static void main(String[] args) {
		String input = "ABC";
		// ABC BAC CAB ACB BCA CBA
		allPermutaion(input, "");

	}

	// using permutation
	private static void allPermutaion(String input, String asf) {
		if (input.length() == 0) {
			System.out.println(asf);
			return;
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String lpart = input.substring(0, i);
			String rpart = input.substring(i + 1);
			String qPart = lpart + rpart;
			allPermutaion(qPart, asf + ch);
		}
	}

}
