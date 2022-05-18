package com.mindgate.mainV2;

import com.mindgate.pojo.Account;

public class AccountApplicationV2 {

	public static void main(String[] args) {
		Account account = new Account(101,"PRATAP BAGWE",1000);
		boolean result=account.withdraw(2000);
		if(result) {
			System.out.println("Transaction completed successfully");
			System.out.println("Balance::"+account.getBalance());
			
		}
		else {
			System.out.println("Transaction failed");
			System.out.println("Balance::"+ account.getBalance());
		}
		System.out.println(" _".repeat(50));
		// deposit
		result = account.deposit(1000);
		if(result) {
			System.out.println("Transaction completed successfully");
			System.out.println("Balance::"+account.getBalance());
		}else {
			System.out.println("Transaction failed");
			System.out.println("Balance::"+ account.getBalance());
	}

	}
}