package com.vm.training.java.exception;
public class ProductNotReceived extends Exception{
String productNo;
ProductNotReceived(String productNo)
{
	this.productNo=productNo;
}
@Override
public String toString() {
	return "ProductNotReceived [productNo=" + productNo + "]";
}

}