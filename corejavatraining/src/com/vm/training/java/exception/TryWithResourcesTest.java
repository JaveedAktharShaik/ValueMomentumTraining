package com.vm.training.java.exception;

import java.io.*;

public class TryWithResourcesTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\DELL\\Desktop\\javeed.txt"))){
			String s = "Value Momentum";
			byte[] by = s.getBytes();
			fos.write(by);
			System.out.println("Success");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e1) {
			
			e1.printStackTrace();
			
		}
	}

}
