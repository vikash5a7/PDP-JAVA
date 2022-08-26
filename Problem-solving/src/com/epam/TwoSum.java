package com.epam;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			Integer requiredNum = (Integer) (target - numbers[i]);
			if (indexMap.containsKey(requiredNum)) {
				int toReturn[] = { indexMap.get(requiredNum), i };
				return toReturn;
			}

			indexMap.put(numbers[i], i);
		}
		return null;
	}

	public static void main(String[] args) {
		int[] val = { 2,4,3,6, 7, 11, 15, };
		int target = 9;
		int[] twoSum = twoSum(val, target);
		for (int i : twoSum) {
			System.out.println(i);
		}

	}

}
