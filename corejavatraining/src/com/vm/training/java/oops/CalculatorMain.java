package com.vm.training.java.oops;

public class CalculatorMain {
	public static void main(String[]args) {
		Calculator c= new Calculator();
		c.add(10,20);
		double b=c.add(1, 8.1);
		System.out.println(b);
		System.out.println(c.add(1, 8,3,4));
	}
	}
