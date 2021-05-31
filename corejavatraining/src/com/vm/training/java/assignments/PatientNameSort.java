package com.vm.training.java.assignments;
import java.util.*;
public class PatientNameSort implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	
	
	
}

