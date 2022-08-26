package com.vikash;

import java.util.Objects;

public class Vikash {

	public static void main(String[] args) {
		System.out.println("\n-------String---------\n");
		String strLiteral1 = "java";
		String strLiteral2 = "java";
		System.out.println("String : " + strLiteral1.equals(strLiteral2));
		System.out.println("String : " + strLiteral1 == strLiteral2);

		System.out.println("\n-------new String---------\n");
		String ss1 = new String("Epam");
		String ss2 = new String("Epam");
		System.out.println("new String : " + ss1.equals(ss2));
		System.out.println("new String : " + ss1 == ss2);

		System.out.println("\n-------StringBuffer---------\n");
		StringBuffer strBuffer1 = new StringBuffer("PDP Incubation");
		StringBuffer strBuffer2 = new StringBuffer("PDP Incubation");
		System.out.println("StringBuffer : " + strBuffer1.equals(strBuffer2));

		System.out.println("\n--------StringBuilder--------\n");
		StringBuilder strBulider1 = new StringBuilder("Google");
		StringBuilder strBulider2 = new StringBuilder("Google");
		System.out.println("StringBuilder : " + strBulider1.equals(strBulider2));

		/*  */

		System.out.println("\n--------Objects.equals--------\n");
		StringBuffer strbuffer = new StringBuffer("Epam");
		StringBuilder strbulider = new StringBuilder("Epam");
		String strliteral = "Epam";
		System.out.println(Objects.equals(strbuffer, strbulider));

		System.out.println("\n---StringBuffer----contentEquals---------\n");
		System.out.println(strliteral.contentEquals(strbulider));

		System.out.println(strBuffer1.toString().equals(strBuffer2.toString()));
	}

}
