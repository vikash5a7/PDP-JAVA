package com.vikash.thread.Synchronazation;

public class ATM {

	static synchronized void withDraw(BankAccount bankAccount, int amount) {
		int balance = bankAccount.getBalnce();

		if ((balance - amount) < - bankAccount.getOverDrafted()) {
			System.out.println("Transaction Failed !!");
		} else {
			bankAccount.debit(amount);
			System.out.println("$" + amount + " Successfully withdraw ");
		}
		System.out.println("current balance: " + bankAccount.getBalnce());

	}
}
