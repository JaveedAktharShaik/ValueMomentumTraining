package com.vm.training.java.multithreading;
import java.util.*;
class Javeed extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Javeed:"+i);
		}
	}
}
class Basha extends Thread
{
	public void run()
	{
		for(int i=10;i<=20;i++)
		{
			System.out.println("Basha:"+i);
		}
	}
}
class Saiteja extends Thread
{
	public void run()
	{
		for(int i=20;i<=30;i++)
		{
			System.out.println("saiteja:"+i);
		}
	}
}

public class MultitaskingDemo {
public static void main(String[] args) {
	Javeed j=new Javeed();
	Basha b=new Basha();
	Saiteja sa=new Saiteja();
	j.run();
	Thread t1=new Thread(b);
	Thread t2=new Thread(sa);
	t1.run();
	t2.run();
	
}
}