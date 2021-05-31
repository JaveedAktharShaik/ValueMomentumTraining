package com.vm.session.io;

import java.io.*;
import java.util.*;
public class TaskFile {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	FileWriter fw=new FileWriter("Sachin.txt");
	BufferedWriter bf=new BufferedWriter(fw);
	bf.write("id   ");
	bf.write("name   ");
	bf.write("dept   ");
	bf.write("\n");
	System.out.println("enter first id");
	bf.write(sc.nextInt()+"   ");
	System.out.println("enter first name");
	bf.write(sc.next()+"   ");
	System.out.println("enter first dept");
	bf.write(sc.next()+"   ");
	bf.write("\n");
	System.out.println("enter second id");
	bf.write(sc.nextInt()+"   ");
	System.out.println("enter second name");
	bf.write(sc.next()+"   ");
	System.out.println("enter second dept");
	bf.write(sc.next()+"   ");
	bf.flush();
	bf.close();
}
}