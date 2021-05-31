package com.vm.training.java.exception;

public class NotFoundTest {
public static void mai(String[] args) {
		
		try {
			Class.forName("Simple");
			System.out.println("found class");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}


}
