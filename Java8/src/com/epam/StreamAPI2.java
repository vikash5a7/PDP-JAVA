package com.epam;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.epam.model.vikash.*;

public class StreamAPI2 {

	public static void main(String[] args) {

		Integer i = 0;
		int j = 0;

        List<Employee> empList = getEmployList();
        separateTwoCategory(empList);
        highestPaidEmployee(empList);
        printAvgAgeOfMaleAndFemal(empList);
        printDepartmentList(empList);
        getMaleFemaleEmpAndCount(empList);
        getMaleFemaleEmp(empList);
	}

	private static void separateTwoCategory(List<Employee> empList) {
		Map<Boolean, List<Employee>> departementList = empList.stream()
				.collect(Collectors.partitioningBy(item -> item.getAge() > 25));
		System.out.println("separateTwoCategory :: " + departementList);
	}

	private static void highestPaidEmployee(List<Employee> empList) {
		Optional<Employee> departementList = empList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("highestPaidEmployee :: " + departementList);
		System.out.println("highestPaidEmployee :: " + departementList.get());
	}

	private static void printAvgAgeOfMaleAndFemal(List<Employee> empList) {
		Map<String, Double> departementList = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("printAvgAgeOfMaleAndFemal :: " + departementList);
	}

	private static void printDepartmentList(List<Employee> empList) {
		List<String> departementList = empList.stream().map(Employee::getDepartment).collect(Collectors.toList());
		System.out.println("printDepartmentList :: " + departementList);
	}

	private static void getMaleFemaleEmpAndCount(List<Employee> empList) {
		Map<String, Long> maleFemalEmp = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("getMaleFemaleEmpAndCount :: " + maleFemalEmp);
	}

	private static void getMaleFemaleEmp(List<Employee> empList) {
		Map<String, List<Employee>> maleFemalEmp = empList.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println("getMaleFemaleEmp :: " + maleFemalEmp);
	}

	private static List<Employee> getEmployList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		return employeeList;
	}
}
