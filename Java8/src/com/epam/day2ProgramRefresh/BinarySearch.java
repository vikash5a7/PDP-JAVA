package com.epam.day2ProgramRefresh;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 11, 23, 32, 52, 76, 81, 111, 135, 140, 170 };
		int search = 11;
		binarySearch(arr, search);
		int output = binarySearch0(arr, search);
		System.out.println("output" + output);
	}

	private static void binarySearch(int[] arr, int search) {
		int value = Arrays.binarySearch(arr, search);
		System.out.println("output: " + value);

	}

	private static int binarySearch0(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid;
		}
		return -1; // key not found.
	}

}
