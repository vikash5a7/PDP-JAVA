package com.epam.day3ProgramRefresh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTheNumbers {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 3, 5, 7);
		List<Integer> list2 = Arrays.asList(8, 2, 7);

		int output = getTheNymber(list1) + getTheNymber(list2);
		List<Integer> outputList = new ArrayList<>();

		while (output > 0) {
			outputList.add(output % 10);
			output = output / 10;
		}
		System.out.println(outputList);

	}

	private static int getTheNymber(List<Integer> list1) {

		int number = 0;
		for (int item : list1) {
			number = number * 10 + item;
		}
		return number;
	}

}
