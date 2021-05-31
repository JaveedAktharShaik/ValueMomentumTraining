package com.vm.training.java.assignments;

import java.util.*;
public class CarMain {
public static void main(String[] args) {
	CarTask ct=new CarTask(1967,"Batmodel");
	for(int i=1;i<=5;i++)
	{
		ct.speed();
		System.out.println("current speed:"+ct.getSpeed());
	}
	/*ct.speed();
	System.out.println("current speed:"+ct.getSpeed());
	ct.speed();
	System.out.println("current speed:"+ct.getSpeed());
	ct.speed();
	System.out.println("current speed:"+ct.getSpeed());
	ct.speed();
	System.out.println("current speed:"+ct.getSpeed());
	ct.speed();
	System.out.println("current speed:"+ct.getSpeed());
	*/
	/*ct.brake();
	System.out.println("after break:"+ct.brake());
	ct.brake();
	System.out.println("after break:"+ct.brake());
	ct.brake();
	System.out.println("after break:"+ct.brake());
	ct.brake();
	System.out.println("after break:"+ct.brake());
	ct.brake();
	System.out.println("after break:"+ct.brake());
	ct.brake();
	*/
	for(int i=1;i<5;i++)
	{
		ct.brake();
		System.out.println("after brake"+ct.brake());
	}
	}
}