package com.vm.training.java.collection;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
	static Boolean search(ArrayList ar1,Integer key)
	{
		return ar1.contains(key);
	}
	static ArrayList sort(ArrayList ar1)
	{
		Collections.sort(ar1);
		return ar1;
	}
	
public static void main(String[] args) {
	ArrayList <Integer> ar1=new ArrayList<Integer>();
	ar1.add(1);
	ar1.add(3);
	ar1.add(14);
	ar1.add(5);
	ar1.add(7);
	ar1.add(8);
	//Collections.sort(ar1);
	//System.out.println("the sorted list"+ar1);
	Collections.reverse(ar1);
	System.out.println("the sorted list"+ar1);
	//System.out.println("min element:"+(Collections.min(ar1)));
	//System.out.println("max element:"+(Collections.max(ar1)));
	System.out.println(search(ar1,14));
	System.out.println(min(ar1));
}
}