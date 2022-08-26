package com.epam;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.epam.model.Employee;

public class PracticeProblem {

	public static void main(String[] args) {

		List<Employee> list = Employee.getAllEmployee();
		Map<Integer, List<Employee>> collect1 = list.stream().collect(Collectors.groupingBy(Employee::getAge));

		System.out.println("List" + collect1);

		System.out.println("");
		
		int sum = list.stream().mapToInt(e -> e.getAge()).sum();

		System.out.println(sum);

		Optional<Employee> max = list.stream()
				.max((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1.getSalary() : e2.getSalary());
		System.out.println("max "+max.get());

		list.sort(Comparator.comparingInt(Employee::getAge).reversed()
				.thenComparing(Comparator.comparing(Employee::getDept)));
		System.out.println("----");

		Optional<Employee> max2 = list.stream().max(
				(employe1, employee2) -> employe1.getAge() > employee2.getAge() ? employee2.getAge() : employe1.getAge());

		Employee finaleEmpl  =list.stream().max((e1,e2)->e1.getAge() > e2.getAge()?e1.getAge():e2.getAge()).get();
		
		System.out.println("Age is "+finaleEmpl.getId());
		
		
		System.out.println("Id of employee "+ max2.get());
		
		list.forEach(System.out::println);

	}
}
