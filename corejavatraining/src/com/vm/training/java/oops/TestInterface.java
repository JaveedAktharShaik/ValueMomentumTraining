package com.vm.training.java.oops;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IVehicle vehicle=new Car();
		
		vehicle.accelarator();
		vehicle.breaks();
		vehicle.clutches();
		System.out.println(vehicle.gears());
		vehicle.steering();
		
		Car car = new TATA();
		car.indicators();

	}

}