package com.epam.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.epam.model.Transaction;

public class Practice {

	public static void main(String[] args) {

		List<Transaction> list = getAllTransaction();

		// 1.  To get a list of the IDs for all the expensive transactions (expensive means
		// > 10000)

		
		list.stream().map(e->e.getExpensiveCost()).filter(e->e>=800).map(e->e);
		
		Map<String, List<Transaction>> vikashAge = list.stream().collect(Collectors.groupingBy(e->e.getCurrency()));
		
		System.out.println();
		List<Integer> listOfID = list.stream().filter(t -> t.getExpensiveCost() > 10000)
				.map(t -> t.getId())
				.collect(Collectors.toList());
		
		
		
		
		
		listOfID.forEach(id -> {
			System.out.print(id+" ");
		});
		System.out.println();

		// calculate the total value of all transactions & COUNT total number of txs
		
		
		System.out.println("calculate the total value of all transactions & COUNT total number of txs");
		
		IntSummaryStatistics summary = list.stream().mapToInt(t->t.getExpensiveCost()).summaryStatistics();
		
		
		System.out.println("Total number is "+summary.getCount() +" and Sum is "+summary.getSum() );
	
		
		
		System.out.println("Salary hightes" + summary.getMax());
		
		
		//Find the highest value transaction

		Optional<Transaction> max = list.stream().max(Comparator.comparing(Transaction::getExpensiveCost));
		
		System.out.println(max.get());
		
		
		//To group a list of transactions by currency
		
		
		
		
		Map<String, List<Transaction>> collect = list.stream().collect(Collectors.groupingBy(Transaction::getCurrency));
		
		
		Set<String> keySet = collect.keySet();
		
		keySet.forEach(x->{
			System.out.println("Currency " +x +" Transactions "+collect.get(x));
		});
		
		
		
		
		//Sample 1: list1 = {a,b,c,d}, list2 = {1,2,3,4}, output= {a1,b2,c3,d4}
		List<String> list1 = Arrays.asList("a","b","c","d");
		
		List<Integer> list2 = Arrays.asList(1,2,3,4);
		String output2 = IntStream.range(0, list1.size()).mapToObj(i->String.format("%s%s", list1.get(i),list2.get(i))).collect(Collectors.joining(","));
		System.out.println(output2);
		
		
		
		//  list1= {10,20,30,40}, list2= {5,5,5,5}, output = {5,15,25,35}
		
		List<Integer> list3 = Arrays.asList(10,20,30,40);
		
		List<Integer> list4 = Arrays.asList(5,5,5,5);
		
		IntStream map = IntStream.range(0, list1.size()).map(i->list3.get(i)-list4.get(i));
		map.forEach(System.out::print);
		
		System.out.println("-----------------");
		
		List<String> output = list1.stream().flatMap(s1->list2.stream().map(s2->s1+s2)).collect(Collectors.toList());
		
		System.out.println(output);
	
	}

	public static List<Transaction> getAllTransaction() {

		List<Transaction> list = new ArrayList<>();
		Transaction t1 = new Transaction(1, "Buy cloth", 80023, "POND");
		Transaction t2 = new Transaction(2, "Travel", 8030, "RS");
		Transaction t3 = new Transaction(3, "Home", 8040, "POND");
		Transaction t4 = new Transaction(4, "Bike", 4800, "POND");
		Transaction t5 = new Transaction(5, "CAR", 8500, "RS");
		Transaction t6 = new Transaction(6, "Buy cloth", 800, "POND");
		Transaction t7 = new Transaction(7, "Game", 800, "Doller");
		Transaction t8 = new Transaction(8, "Sport", 2800, "RS");
		Transaction t9 = new Transaction(9, "Buy cloth", 8200, "RS");
		Transaction t10 = new Transaction(10, "Home", 8400, "POND");
		Transaction t11 = new Transaction(11, "Rent", 800, "EURO");
		Transaction t12 = new Transaction(12, "Food", 900000, "Doller");

		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		list.add(t8);
		list.add(t9);
		list.add(t10);
		list.add(t11);
		list.add(t12);
		return list;
	}

}
