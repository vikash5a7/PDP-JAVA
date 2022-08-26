package com.epam.day2ProgramRefresh;

public class LogenstString {

	public static void main(String[] args) {

		String input = "I am interested to grow in my organization ";

		String[] spilt = input.split(" ");
		String output = spilt[0];

		
		for (int i = 0; i < spilt.length - 1; i++) {
			if (output.length() < spilt[i].length()) {
				output = spilt[i];
			}
		}
		
		System.out.println(output);
	}

}
