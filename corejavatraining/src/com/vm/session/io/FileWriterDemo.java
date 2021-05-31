package com.vm.session.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		
		File f=new File("Sachin.txt");
		FileWriter fw=new FileWriter(f,true);
		
		fw.write("\n");
		fw.write("java");
		fw.write("is easy to learn \n");
		
		
		fw.flush();
		fw.close();
		System.out.println("data written");
	}
}