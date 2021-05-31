package com.vm.training.java.strings;

public class StringObjectCreation {
	
	public static void main(String[] args) {
		
		String s1 = new String("Value Momentum");
		String s2 = new String("Value Momentum");
		
		String s3 = "Value Momentum";
		String s4 = "Value Momentum";
		
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s3 == s4);//true
		System.out.println(s3 == s4);//true
		
		s1 = s1.concat("s");
				
		System.out.println(s1);
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(10));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.intern());
		
		System.out.println(s1.intern()== s2.intern());
		
		String s5 = "A";
		String s6 = "A";
		StringBuilder sb=new StringBuilder("kyc");
		sb.append("abc");
		System.out.println(sb);
		StringBuffer sbf=new StringBuffer("Javeed");
		sbf.append("akthar");
		System.out.println(sbf);
		
		
		System.out.println(s6.compareTo(s5));
		
		
		
		
	}

}