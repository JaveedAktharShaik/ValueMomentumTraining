package com.vm.session.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateCalculation {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		System.out.println("today "+today);
		
		System.out.println("next day"+ today.plusDays(1));
		System.out.println("after two week"+ today.plusWeeks(2));
		System.out.println("next month"+ today.plusMonths(1));
		System.out.println("next year"+ today.plusYears(1));
		
		LocalDate bookingDate = LocalDate.of(2021, 05, 27);
		
		if( bookingDate.isAfter(today))
			System.out.println("Correct date you can book");
		else
			System.out.println("invalid date booking date cnnot be previous");
		
	}

}
