package com.vm.training.java.collection;

import java.util.ArrayList;

public class CompareTest {
	public static void main(String[] args) {
		ArrayList<Product>ar=new ArrayList<Product>();
		ar.add(new Product(1,"AC",40));
		ar.add(new Product(2,"Book",30));
		ar.add(new Product(3,"Bike",400));
		System.out.println(ar);
		
		for(Product product:ar)
		{
			System.out.println(product);
		}
		for(Product product:ar)
		{
			if(product.getPrice()>99)
			{
				System.out.println(product.getName());
	}
		}
		
	}
}
