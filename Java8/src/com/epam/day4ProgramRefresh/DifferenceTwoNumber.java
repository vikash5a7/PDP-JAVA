package com.epam.day4ProgramRefresh;

import java.util.Arrays;

public class DifferenceTwoNumber {

	public static void main(String[] args) {

		int[] A = { 1, 3, 15, 11, 2 };
		int[] B = { 23, 127, 235, 19, 8 };

		int output = differenceValue(A, B);
		System.out.println("Output " + output);

	}

	private static int differenceValue(int[] a, int[] b) {

		int lenghtA = a.length;
		int lenghtB = b.length;

		Arrays.sort(a);
		Arrays.sort(b);
		int[] outoutArray = new int[2];

		int first = 0;
		int second = 0;

		// Initialize result as max value
		int output = Integer.MAX_VALUE;

		// Scan Both Arrays upto
		// sizeof of the Arrays
		while (first < lenghtA && second < lenghtB) {
			if (Math.abs(a[first] - b[second]) < output) {
				output = Math.abs(a[first] - b[second]);
				outoutArray[0] = a[first];
				outoutArray[1] = b[second];
			}
			if (a[first] < b[second])
				first++;
			else
				second++;
		}
		System.out.println("First " + outoutArray[0] + " Second " + outoutArray[1]);
		return output;
	}
}
