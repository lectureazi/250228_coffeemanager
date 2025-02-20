package com.mc.coffeemanager.domain.account;

public class Account {

	private int balance;
	private int sales;
	private int expenses;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public int getSales() {
		return sales;
	}

	public int getExpenses() {
		return expenses;
	}

	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	public boolean registExpenses(int expenses) {
		if(balance < expenses) return false;
		
		balance -= expenses;
		this.expenses += expenses;
		return true;
	}
	
	


}
