package com.anand.creational.factory;

public class CarImpl {

	public static void main(String[] args) {
		
		Car car = CarFactory.getCar("M");
		
		car.getCarFeatures();

	}

}
