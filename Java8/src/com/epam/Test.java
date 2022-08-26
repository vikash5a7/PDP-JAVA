package com.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		
	
		
		List<String> list = new ArrayList<>();

		list.add("vikash@gmail.com");
		list.add("vikash@gmail.com");
		list.add("vikash@gmail.com");
		list.add("vikash@hdfc.com");
		list.add("vikash@gmail.com");
		list.add("vikash@outlook.com");
		list.add("vikash@a.com");
		list.add("vikash@gmail.com");
		list.add("vikash@a.com");
		list.add("vikash@gmail.com");
		list.add("vikash@c.com");
		list.add("vikash@gmail.com");
		list.add("vikash@b.com");

		Map<String, Long> collect = list.stream().map(e -> e.substring(e.indexOf("@") + 1, e.length()))
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		System.out.println(collect);
		
		String v = "abc xyz mno bca igh abc mno is the bca mca is now able to xyz now";
		
		
		Map<String, Long> count2 = Arrays.stream(v.split("\\s")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
		
		System.out.println("counting is "+count2);
		
		
		String name ="vikashKumar";
		
		
		
		
		
		Map<String, Long> collect2 = Arrays.stream(name.split("")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println("Map");
		
		
		
		

	}

}
