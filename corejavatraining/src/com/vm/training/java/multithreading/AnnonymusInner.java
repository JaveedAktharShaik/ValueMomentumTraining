package com.vm.training.java.multithreading;

import java.util.*;
class parent
{
	void phone()
	{
		System.out.println("rining phone");
	}
}
public class AnnonymusInner {
public static void main(String[] args) {
parent p1=new parent();
p1.phone();
parent p2=new parent()
{
	void phone()
	{
		System.out.println("iphone");
	}
};
p2.phone();

}
}
