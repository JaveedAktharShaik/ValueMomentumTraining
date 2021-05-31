package com.vm.session.io;
import java.io.*;
public class BufferedWriterDemo {
public static void main(String[] args) throws IOException {

	FileWriter fw=new FileWriter("Sachin.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("hello");
	bw.newLine();
	bw.write("java");
	bw.newLine();
	bw.write("thanks");
	bw.flush();
	bw.close();
	
}
}
