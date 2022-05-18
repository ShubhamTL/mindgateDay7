package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	private double initialoverdraftBalance;
		
	

	public Current() {
		System.out.println("Default constructor of current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		this.initialoverdraftBalance = initialoverdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount > 0) {
			if (amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;
			}
		if (amount <= getBalance() + overdraftBalance) {
			amount = amount - getBalance();
					setBalance(0);
			overdraftBalance = overdraftBalance - amount;
			return true;
		}

		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if (initialoverdraftBalance > overdraftBalance) {
				if (amount < (initialoverdraftBalance - overdraftBalance)) {
					overdraftBalance = overdraftBalance + amount;
					return true;
				}
				else {
					amount = amount - (initialoverdraftBalance - overdraftBalance);
					setBalance(getBalance() + amount);
					overdraftBalance = initialoverdraftBalance;
					return true;
				}
				
			}
		}
		return false;
	}

	public double getoverdraftBalance;

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	public double getGetoverdraftBalance() {
		return getoverdraftBalance;
	}

	public void setGetoverdraftBalance(double getoverdraftBalance) {
		this.getoverdraftBalance = getoverdraftBalance;
	}
}
