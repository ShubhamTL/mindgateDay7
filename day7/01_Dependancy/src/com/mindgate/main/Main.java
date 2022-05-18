package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {
	public static void main(String[] args) {
		
		Address address= new Address(413205, "Ag Road"	, "Ahmednagar", "Maharashtra");
		
		Employee employee = new Employee(101, "Shubham", 20500, address);
		
		System.out.println(employee);
	}

}
