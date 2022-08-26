package com.epam.model;

public class Transaction {

	private int id;
	private String history;
	private int expensiveCost;
	private String currency;


	public Transaction(int id, String history) {
		super();
		this.id = id;
		this.history = history;
	}

	public Transaction(int id, String history, int expensiveCost, String currency) {
		super();
		this.id = id;
		this.history = history;
		this.expensiveCost = expensiveCost;
		this.currency = currency;
	}

	public int getExpensiveCost() {
		return expensiveCost;
	}

	public void setExpensiveCost(int expensiveCost) {
		this.expensiveCost = expensiveCost;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", history=" + history + ", expensiveCost=" + expensiveCost + ", currency="
				+ currency + "]";
	}

	

	
	
	
	
	
	
}
