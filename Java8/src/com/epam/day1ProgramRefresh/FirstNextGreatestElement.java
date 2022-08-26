package com.epam.day1ProgramRefresh;

public class FirstNextGreatestElement {

	public static void main(String[] args) {
		int[] array = { 15, 10, 16, 20, 8, 9, 7, 50 };

		nextNumber(array);
	}

	private static void nextNumber(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] < array[j]) {
					System.out.println(array[i] + "->" + array[j]);
					break;
				}else if(j==array.length-1) {
					System.out.println(array[i] + "->" + "-1");
					
				}
			}
		}

	}
}
