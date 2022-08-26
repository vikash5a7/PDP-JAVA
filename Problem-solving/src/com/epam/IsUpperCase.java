package com.epam;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsUpperCase {

	public static void main(String[] args) {
		String v = "VIKASH";

		boolean t = Integer.valueOf(1).equals(Long.valueOf(1));

		System.out.println();

		List<Integer> list = List.of(1, 2, 3, 4);

		int sum = list.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * x).sum();
		System.out.println(sum);

		System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));

		List<String> list2 = Arrays.asList("vikash", "VIKASH", "ram", "RAM");

		list2.stream().filter(singleWord -> singleWord.equals(singleWord.toUpperCase())).collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
