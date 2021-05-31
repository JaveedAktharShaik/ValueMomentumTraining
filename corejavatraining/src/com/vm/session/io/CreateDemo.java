package com.vm.session.io;

import java.io.File;
import java.io.IOException;

public class CreateDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("Sachin.txt");
		
		if(f.exists())
		{
			System.out.println("File is present");
		}
		else
		{
			System.out.println("File is not present we are creating");
			f.createNewFile();
			System.out.println("File Created");
		}

	}

}
