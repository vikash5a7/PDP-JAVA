package com.epam;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.epam.model.Person;

public class Exapmle {

	public static void main(String[] args) {

		List<Person> list = Person.getPerson();

		list.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList()).forEach(System.out::println);

		Map<Integer, List<Person>> l = list.stream().collect(Collectors.groupingBy(p -> p.age));

		list.stream().collect(Collectors.groupingBy(p -> p.age)).forEach((age, p) -> {
			System.out.println("Age " + age + " person " + p);
		});

		double av = list.stream().collect(Collectors.averagingInt(p -> p.age));

		Double collect = list.stream().collect(Collectors.averagingInt(p -> p.age));

		IntSummaryStatistics summaryStatistics = list.stream().collect(Collectors.summarizingInt(p -> p.age));

		System.out.println("summaryStatistics" + summaryStatistics);

		String phrase = list.stream().filter(p -> p.age >= 18).map(p -> p.name)
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

		Map<Integer, String> collect2 = list.stream()
				.collect(Collectors.toMap(p -> p.age, p -> p.name, (name1, name2) -> name1 + ";" + name2));

		Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> new StringJoiner(" | "), // supplier
				(j, p) -> j.add(p.name.toUpperCase()), // accumulator
				(j1, j2) -> j1.merge(j2), // combiner
				StringJoiner::toString);

		String names = list.stream().collect(personNameCollector);

		System.out.println(names);

		list.stream().reduce((p1, p2) -> p1.age > p2.age ? p1 : p2).ifPresent(System.out::println);

		list.stream().reduce((p1, p2) -> p1.age < p2.age ? p1 : p2).ifPresent(System.out::println);

		Integer sume = list.stream().reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 += sum2);
		System.out.println("Sum of the age is" + sume);

		Integer ageSum = list.stream().reduce(0, (sum, p) -> {
			System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
			return sum += p.age;
		}, (sum1, sum2) -> {
			System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
			return sum1 + sum2;
		});

		System.out.println("Sum of the age is" + ageSum);

		list.stream().allMatch(p -> p.age > 10);

		list.stream().map(p -> p.name.length()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		
		

	}

}
