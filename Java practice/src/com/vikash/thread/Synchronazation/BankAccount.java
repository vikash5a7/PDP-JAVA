package com.vikash.thread.Synchronazation;

public class BankAccount {
	private int balance = 0;
	private final int overdraft;

	public BankAccount(int overdraft) {
		this.overdraft = overdraft;
	}

	void topUp(int amount) {
		balance += amount;
	}

	void debit(int amout) {
		balance -= amout;
	}

	int getBalnce() {
		return balance;
	}

	int getOverDrafted() {
		return overdraft;
	}

}
