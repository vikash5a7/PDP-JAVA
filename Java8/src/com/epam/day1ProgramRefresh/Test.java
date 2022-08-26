package com.epam.day1ProgramRefresh;

public class Test {

	public void print(long i) {
		System.out.println("long");
	}

	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(int i) {

		System.out.println("int");

	}

	public static void main(String args[]) {

		Test test = new Test();
		test.print(10);

	}
}
