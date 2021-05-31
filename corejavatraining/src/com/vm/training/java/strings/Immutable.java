package com.vm.training.java.strings;

public  final class Immutable {

	private int id =100;
	private String name;
	 Immutable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	
	
}