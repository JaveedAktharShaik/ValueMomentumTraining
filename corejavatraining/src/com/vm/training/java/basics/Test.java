package com.vm.training.java.basics;

import com.vm.training.java.oops.Customer;

public class Test {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setFirstName("javed");
		customer1.setId(1);
		System.out.println(customer1.getFirstName());
		System.out.println(customer1.getId());
		//customer customer2 = new Customer(201,"ajay","kumar","recurring");
		//customer customer3 = new Customer(202,"bhargav","rao","current");
		//customer customer4 = new Customer(203,"suraj","gupta","sav")
		
	}
}
