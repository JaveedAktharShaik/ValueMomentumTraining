package com.vm.session.io;
import java.io.*;
import java.util.*;
public class Task {
public static void main(String[] args)  {
	try {
		String s="";
		File f=new File("C:\\Users\\DELL\\Desktop");
		FileReader fr=new FileReader(f);
		int r=fr.read();
		while(r!=-1)
		{
			s=s+(char)r;
			r=fr.read();
		}
		fr.close();
		StringBuffer sb=new StringBuffer(s);
		String s1=sb.reverse().toString();
		FileWriter fw=new FileWriter(f);
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}