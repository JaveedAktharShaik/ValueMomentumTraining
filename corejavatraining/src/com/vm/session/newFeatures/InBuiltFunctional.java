package com.vm.session.newFeatures;

import java.util.function.Function;
import java.util.function.Predicate;



public class InBuiltFunctional {
	public static void main(String[] args) {
		Predicate<Integer> p = (var1)-> var1>2;
		
		Predicate<String> p2 = (v1)-> v1.startsWith("a");
		System.out.println(p2.test("assam"));
		
		Function<String.String> f1=(var)->var.concat("hello welcome");
		
	}

}
