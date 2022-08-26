package com.epam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class JavaEight {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a1", "a2", "a3", "c2", "c1");
		
		list.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		
		list.stream().findFirst().ifPresent(System.out::println);
		
		IntStream.range(1, 20).filter(i->i%2==0).forEach(System.out::println);
		
		
		IntStream.range(1, 9).mapToObj(i->"a"+i).forEach(System.out::println);

	}

}



