package com.mindgate.mainV3;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationV3 {

	public static void main(String[] args) {
		int accountNumber;
		String name;
		Double balance;
		int transactionChoice;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to XYZ bank");
		System.out.println("Enter account Number");
		accountNumber = scanner.nextInt();
		
		System.out.println("Enter name");
		name = scanner.next();
		
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		
		Account account = new Account(accountNumber, name,balance);
		
		System.out.println("Account Opened Successdfully");
		System.out.println();
		
		System.out.println("Menu");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check balance");
		
		System.out.println("Enter your choice");
		transactionChoice = scanner.nextInt();
		
		switch (transactionChoice) {
		case 1:
			System.out.println("Enter amount to be withdraw");
			Double amount=scanner.nextDouble();
			boolean result=account.withdraw(amount);
			if(result) {
				System.out.println("withdraw successful");
				System.out.println("balance::"+account.getBalance);
			}else {System.out.println("transaction failed");
					System.out.println("Balance::"+ account.getBalance);
			}
			break;
		
		case 2:
			System.out.println("Enter amount to be deposit");
		Double amount=scanner.nextDouble();
		boolean result=account.deposit(amount);
		if(result) {
			System.out.println("deposit successful");
			System.out.println("balance::"+account.getBalance);
		}else {System.out.println("transaction failed");
				System.out.println("Balance::"+ account.getBalance);
			break;
		case 3:
			System.out.println("Balance::"+ account.getBalance);
			break;
	}
		

}
