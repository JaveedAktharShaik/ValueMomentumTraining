package com.vm.session.serilization;

import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	transient String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
