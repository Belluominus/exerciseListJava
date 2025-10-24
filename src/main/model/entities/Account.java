package main.model.entities;

import main.model.exceptions.AccountException;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	private Double withdrawLimit;
		
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount){
		if(amount > withdrawLimit){
			throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(balance < amount) {
			throw new AccountException("Withdraw error: Not enough balance");
		} else {
			balance -= amount;
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}
}