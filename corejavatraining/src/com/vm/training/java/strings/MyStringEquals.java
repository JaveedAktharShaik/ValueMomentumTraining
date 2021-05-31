package com.vm.training.java.strings;

public class MyStringEquals {
	
	public static void main(String a[]){
        String x = "JUNK";
        String y = "JUNk";
       
        if(x.equals(y)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
            
            if(x.equalsIgnoreCase(y)){
                System.out.println("Both strings are equal.");
            } else {
                System.out.println("Both strings are not equal.");
            }
        }
        
    }

}
