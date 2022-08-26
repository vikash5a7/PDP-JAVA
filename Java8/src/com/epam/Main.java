package com.epam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.epam.model.*;

public class Main {
	public static void main(String[] args) {

		// sorting using the java-8
		List<Transaction> item = addItem();
		Collections.sort(item, new Comparator<Transaction>() {
			public int compare(Transaction t1, Transaction t2) {
				return t2.getHistory().compareTo(t1.getHistory());
			}
		});

		System.out.println("Sorting............");
		System.out.println(item);

		/*
		 * List out the item which history value has "H";
		 */

		List<Integer> transactionIds = item.stream()
				.filter(t -> t.getHistory().equals("H"))
				.map(Transaction::getId)
				.collect(Collectors.toList());
		System.out.println(transactionIds);
		
		
		

	}

	public static List<Transaction> addItem() {

		List<Transaction> item = new ArrayList<>();
		Transaction t1 = new Transaction(1, "G");
		Transaction t2 = new Transaction(2, "H");
		Transaction t3 = new Transaction(3, "G");
		Transaction t4 = new Transaction(4, "I");
		Transaction t5 = new Transaction(5, "K");
		Transaction t6 = new Transaction(6, "L");
		Transaction t7 = new Transaction(7, "M");

		item.add(t1);
		item.add(t2);
		item.add(t3);
		item.add(t4);
		item.add(t5);
		item.add(t6);
		item.add(t7);
		return item;

	}

}
