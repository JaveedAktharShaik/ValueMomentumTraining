package com.vm.training.java.multithreading;
import java.util.*;
class Account
{
	 public void balance(int money)
	{
		for(int i=0;i<=money;i++)
		{
			System.out.println(Thread.currentThread().getName()+"is updating"+money);
		}
	}
}
class Transaction implements Runnable
{
	Account account=new Account();
	@Override
	public void run()
	{
		account.balance(5);
	}
	
}

public class SynchronizationDemo {

	public static void main(String[] args) {

		Transaction transaction=new Transaction();
		Thread deposit=new Thread(transaction);
		Thread withdraw=new Thread(transaction);
		deposit.setName("deposit");
		withdraw.setName("withdraw");
		deposit.start();
		withdraw.start();
		
		
		
	}

}