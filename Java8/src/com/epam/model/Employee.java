package com.epam.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private int salary;
	private String dept;
	private int age;
	private String transaction;

	public Employee(int id, int salary, String dept, int age, String transaction) {
		super();
		this.id = id;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
		this.transaction = transaction;
	}

	public static List<Employee> getAllEmployee() {

		List<Employee> list = new ArrayList<>();

		Employee e = new Employee(1, 2000, "IT", 20, "Not");
		Employee e1 = new Employee(2, 2000, "Police", 25, "Not");
		Employee e2 = new Employee(3, 2000, "Forest", 22, "Not");
		Employee e3 = new Employee(4, 3000, "Ab", 27, "Not");
		Employee e4 = new Employee(5, 25000, "Bank", 60, "Not");
		Employee e5 = new Employee(6, 20600, "Nothing", 70, "Not");
		Employee e6 = new Employee(7, 20300, "IT", 29, "Not");
		Employee e7 = new Employee(8, 4000, "IT", 27, "Not");
		Employee e8 = new Employee(9, 6000, "IT", 69, "Not");

		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);

		return list;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", dept=" + dept + ", age=" + age + ", transaction="
				+ transaction + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
}
