package com.vm.training.java.collection;

import java.util.*;

public class TreeBasic {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Javeed");
		ts.add("Akthar");
		ts.add("Manu");
		System.out.println(ts);
		System.out.println("is tree set empty:"+ts.isEmpty());
		System.out.println("size of treeset is:"+ts.size());
		ts.remove("basha");
		System.out.println(ts);
		ts.clear();
		System.out.println("is tree set empty after deleting:"+ts.isEmpty());
		
		
	}
	}
