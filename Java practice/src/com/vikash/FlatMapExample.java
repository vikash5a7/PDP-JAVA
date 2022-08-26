package com.vikash;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String args[]) {

		List<String> list = Arrays.asList("Akash", "Suhana", "SUHANA", "Nitesh", "Jay");

		List<String> list1 = list.stream().filter(s -> s.equals(s.toUpperCase())).collect(Collectors.toList());
		System.out.println(list1);

		Student s1 = new Student(1, 40);
		Student s2 = new Student(2, 60);
		Student s3 = new Student(3, 42);
		Student s4 = new Student(4, 63);

		List<Student> listofStudents = Arrays.asList(s1, s2, s3, s4);

		List<Department> listOfDepartments = Arrays.asList(new Department("mechanical", listofStudents),
				new Department("computers", listofStudents), new Department("civil", listofStudents));

		// find the highest marks from all the departments
		Stream<Student> studentsStream = listOfDepartments.stream()
				.flatMap(department -> department.getStudents().stream());
		int max = studentsStream.mapToInt(student -> student.getMarks()).max().getAsInt();
		System.out.println(max);

		// find the student having highest marks
		Student student = listOfDepartments.stream().flatMap(department -> department.getStudents().stream())
				.sorted(Comparator.comparing(Student::getMarks).reversed()).findFirst().get();
		System.out.println(student);

		// find the department that has highest mark
		listOfDepartments.stream().collect(Collectors.groupingBy(Department::getDepartmentName));

		Map<String, Integer> map = listOfDepartments.stream().collect(Collectors.toMap(Department::getDepartmentName,
				d -> d.getStudents().stream().mapToInt(Student::getMarks).max().getAsInt()));
		System.out.println(map);

		// find the departments with student with highest marks
		Map<String, Student> maprs = listOfDepartments.stream().collect(Collectors.toMap(Department::getDepartmentName,
				d -> d.getStudents().stream().max(Comparator.comparing(Student::getMarks)).get()));
		System.out.println(maprs);

		// find the second highest marks across all the departments

	}
}
