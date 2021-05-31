package com.vm.training.java.oops;

public class GrandFather {
	
	int age;
	
	public GrandFather(int age) {
		this.age = age;
	}
	void walk() {
		System.out.println("i cant walk fast bcos my age is:"+age);
	}

}

class Father extends GrandFather{
	
	int myAge;
	public Father(int age,int myAge) {
		
		super(age);
		this.myAge = myAge;
		
	}
	void walk() {
		System.out.println("I can walk fast "+myAge);
	}
	void show() {
	}
	}
class Son extends Father{
	int myTeenAge;
	public Son(int age,int myAge,int myTeenAge) {
		super(age,myAge);
		this.myTeenAge=myTeenAge;
	}
	void walk()
	{
		System.out.println("I can walk run because my age is :"+myTeenAge);
	}
}
