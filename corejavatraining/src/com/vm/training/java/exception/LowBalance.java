package com.vm.training.java.exception;

public class LowBalance extends Exception {
	String message;
	void LowBalanceException(String message) {
		this.message=message;
	}
	@Override
	public String toString() {
		return "LowBalanceException [message=" + message + "]";
	}
}
