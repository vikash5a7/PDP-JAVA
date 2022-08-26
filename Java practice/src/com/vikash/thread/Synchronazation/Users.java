package com.vikash.thread.Synchronazation;

public class Users {

	static final BankAccount account = new BankAccount(50);

	public static void main(String[] args) {

		account.topUp(100);

		Thread t1 = new Thread(() -> {

			ATM.withDraw(account, 100);

		});
		
		Thread t2 = new Thread(() -> {

			ATM.withDraw(account, 100);

		});
		

		t1.start();

		t2.start();
		
	}

}
