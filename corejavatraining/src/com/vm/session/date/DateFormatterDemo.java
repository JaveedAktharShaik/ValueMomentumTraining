package com.vm.session.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(LocalDate.now());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd"); 
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy MM dd");
		
		DateTimeFormatter dtfull= DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtmedium=  DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtshort=  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		
		
		
		
		
		String afterFormat= today.format(dtf);
		System.out.println("date after format"+afterFormat);
		
		String afterFormat2 =today.format(dtfull);
		System.out.println("date after format"+afterFormat2);
		
		String fulldate =today.format(dtfull);
		System.out.println("full date"+ fulldate);
		
		String mediumdate =today.format(dtmedium);
		System.out.println("medium date"+ mediumdate);
		
		String shortdate =today.format(dtshort);
		System.out.println("short date"+ shortdate);



  

		
		
		
		
		


		
		

	}

}
