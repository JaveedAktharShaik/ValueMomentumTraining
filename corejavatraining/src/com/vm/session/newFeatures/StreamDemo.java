package com.vm.session.newFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StreamDemo {
	public static void main(String[] args) {
		
		//List l= Arrays.asList(2,3,5,7,9,1,15,2);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(8);
		nums.add(1);
		
		System.out.println("numbers :"+nums);
		
		nums.forEach(s->System.out.println(s));
		
		long count = nums.stream().count();
		System.out.println("total elements present in stream"+   count);
		
		System.out.println("number greater than 2");
		nums.stream().filter(s->s>2).forEach(s->System.out.println(s));
		
		
		
		
		
	}

}
