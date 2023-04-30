package com.anand.structural.decorator;

public class CustomBike implements Bike {

	private Bike bike;
	
	public CustomBike(Bike bike) {
		super();
		this.bike = bike;
	}
	
	@Override
	public void assembleBike() {
		// TODO Auto-generated method stub
		bike.assembleBike();
		System.out.println("Adding Custom Features..");
	}

}
