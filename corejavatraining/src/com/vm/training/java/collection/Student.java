package com.vm.training.java.collection;
import java.util.*;
public class Student {
public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	 hm.put(100,"koushik");
	 hm.put(101,"subha");
	 hm.put(102,"basha");
	 hm.put(103,"javed");
	 System.out.println(hm);
	 String oldValue = hm.put(101,"tiger" );
	 System.out.println(hm);
}
}