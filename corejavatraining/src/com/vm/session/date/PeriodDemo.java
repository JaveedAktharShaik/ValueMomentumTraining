package com.vm.session.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {

		
		LocalDate today =LocalDate.now();
		LocalDate joiningDate = LocalDate.of(1999, 06,06 );
		
		Period period = Period.between(today, joiningDate);
		System.out.println("Year:"+period.getYears()+"month :"+period.getMonths() +" day :"+ period.getDays());
		
	}

}
