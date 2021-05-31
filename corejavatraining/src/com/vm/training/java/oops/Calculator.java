package com.vm.training.java.oops;

public class Calculator {
	double sum=0;
	Long l;
	 
	void add(int num1,int num2)
	{
		sum=num1+num2;
		System.out.println(sum);
	}
	double add(int num1,double num2)
	{
		sum=num1+num2;
		return sum;
	}
	long add(int num1,int num2,int num3,int num4)
	{
		l=(long) (num1+num2+num3+num4);
		return l;
	}
	
}
