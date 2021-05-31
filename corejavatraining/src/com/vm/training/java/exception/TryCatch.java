package com.vm.training.java.exception;

public class TryCatch {
	
	public static void main(String[] args) {
		
		try {
			int[] i= {1,2};
			System.out.println(i[2]);		
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}

}
