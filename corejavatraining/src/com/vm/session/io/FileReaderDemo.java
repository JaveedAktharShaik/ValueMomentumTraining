package com.vm.session.io;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		File f=new File("Sachin.txt");
		FileReader fr=new FileReader(f);
		
		
		int readChar=fr.read();
		while(readChar!=-1)
		{
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println((char)readChar);
			readChar=fr.read();
		}

	}
	}


