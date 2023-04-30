package com.anand.structural.decorator;

public class LuxuryBike extends CustomBike {

	public LuxuryBike(Bike bike) {
		super(bike);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assembleBike() {
		// TODO Auto-generated method stub
		super.assembleBike();
		System.out.println("Adding Luxury bike Features");
	}

}
