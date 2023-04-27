package com.anand.creational.builder;

public class BuilderImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car = new Vehicle.VehicleBuilder("",4).setAirBag(4).build();
		Vehicle bike = new Vehicle.VehicleBuilder("500CC", 2).build();

	}

}
