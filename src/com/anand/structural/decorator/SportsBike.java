package com.anand.structural.decorator;

public class SportsBike extends CustomBike {

	public SportsBike(Bike bike) {
		super(bike);
	}
	
	@Override
	public void assembleBike() {
		// TODO Auto-generated method stub
		super.assembleBike();
		
		System.out.println("Adding features of Sports Bike");
	}
}
