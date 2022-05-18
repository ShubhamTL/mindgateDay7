package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AnotationMain {
public static void main(String[] args) {
	

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
	
	Address address = applicationContext.getBean("address", Address.class);
	address.setAddressId(102);
	address.setCity("Pune");
	address.setStreet("J M Road");
	address.setState("maharashrta");
	
	 System.out.println(address);
	 System.out.println("-".repeat(50));
	 
	 Employee employee = applicationContext.getBean("employee", Employee.class);
	 employee.setEmployeeId(001);
	 employee.setName("Shubham");
	 employee.setSalary(38383);
	 employee.setHomeAddress(address);
	 System.out.println(employee);
}
}
