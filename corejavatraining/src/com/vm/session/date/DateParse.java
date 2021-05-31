package com.vm.session.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParse {
	public static void main(String[] args) {
		
		String starDate ="2021-05-25";
		
		LocalDate ld =LocalDate.parse(starDate);
		System.out.println(ld);
		
		String bookingDate ="2021/May/25";
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		
	}
		
		
		
		


		
}
