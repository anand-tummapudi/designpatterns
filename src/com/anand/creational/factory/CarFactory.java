package com.anand.creational.factory;

public class CarFactory {
	
	public static Car getCar(String carType) {
		
		switch(carType) {
		case "M": return new MaruthiCar();
		case "H": return new HondaCar();		  	
		}
	return null;
	}

}
