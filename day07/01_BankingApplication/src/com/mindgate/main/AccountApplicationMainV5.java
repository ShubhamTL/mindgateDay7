package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV5 {
	public static void main(String[] args) {
		int accountNumber;
		String name;
		Double balance;
		int transactionChoice;
		Scanner scanner = new Scanner(System.in);
		boolean result;
		boolean isSalary;

		System.out.println("Welcome to XYZ bank");
		System.out.println("-".repeat(50));
		System.out.println("Enter account Number");
		accountNumber = scanner.nextInt();
		
		System.out.println("Enter name");
		name = scanner.next();
		
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		balance=scanner.nextDouble();
		System.out.println("do you want to open salary account true or false");
		isSalary = scanner.nextBoolean();
		
		Account account = new Saving(accountNumber, name,balance,isSalary);
		
		System.out.println("Account Opened Successdfully");
		System.out.println();
		do {
			
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
			result=account.withdraw(amount);
			if(result) {
				System.out.println("withdraw successful");
				System.out.println("balance::"+account.getBalance);
			}else {System.out.println("transaction failed");
					System.out.println("Balance::"+ account.getBalance);
			}
			break;
		
		case 2:
			System.out.println("Enter amount to be deposit");
		 amount=scanner.nextDouble();
		 result=account.deposit(amount);
		if(result) {
			System.out.println("deposit successful");
			System.out.println("balance::"+account.getBalance);
		}else {System.out.println("transaction failed");
				System.out.println("Balance::"+ account.getBalance);
		}
			break;
		case 3:
			System.out.println("Balance::"+ account.getBalance);
			break;
		
			default:
				System.out.println("Invalid:" +transactionChoice);
		}
		System.out.println("do you want to continue \n (yes/no)");
		int continueChoice = scanner.nextInt();
	}
		while (continueChoice.equalsIgnoreCase("yes")); 
			System.out.println("Thank you for banking with us");
		}
}
}
