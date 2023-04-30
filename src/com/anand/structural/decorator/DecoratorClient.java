package com.anand.structural.decorator;

public class DecoratorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike basicBike = new BasicBike();
		basicBike.assembleBike();
		
		System.out.println("-------------");
		Bike LuxuryBike = new LuxuryBike(new BasicBike());
		LuxuryBike.assembleBike();
		
		System.out.println("-------------");
		Bike sportsBike = new SportsBike(new LuxuryBike(new BasicBike()));
		sportsBike.assembleBike();
		
		
	}

}
