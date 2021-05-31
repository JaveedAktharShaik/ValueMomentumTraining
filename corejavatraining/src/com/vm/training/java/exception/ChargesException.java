package com.vm.training.java.exception;
public class ChargesException extends Exception{

	String  message;
	ChargesException(String message)
	{
		
		this.message=message;
	}
	public String toString() {
		return message;
	}

}