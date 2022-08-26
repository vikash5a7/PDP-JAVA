package com.epam;

public class RemoveDuplicates {
	public static void main(String[] args) {

		int a[] = { 1, 1, 2 };
		int count = removeDuplicates(a);
		System.out.println("Count " + count);
	}

	public static int removeDuplicates(int[] arr) {
		int writeIdx = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] != arr[i] ) {
				writeIdx++;
				
			}
		}
		
		
		return writeIdx;
	}
}
