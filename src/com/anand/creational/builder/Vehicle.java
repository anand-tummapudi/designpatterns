package com.anand.creational.builder;

public class Vehicle {
	
	private int wheels;
	private String engine;
	private int airBag;
	
	private Vehicle(VehicleBuilder vehicleBuilder) {
		super();
		this.wheels = vehicleBuilder.wheels;
		this.engine = vehicleBuilder.engine;
		this.airBag = vehicleBuilder.airbag;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getAirBag() {
		return airBag;
	}
	
	static class VehicleBuilder{
		private String engine;
		private int wheels;
		
		private int airbag;
		
		public VehicleBuilder(String engine,int wheels) {
			this.engine = engine;
			this.wheels = wheels;
		}
		
		public VehicleBuilder setAirBag(int airbag) {
			this.airbag = airbag;
		return this;
		}
		
		public Vehicle build() {
			return new Vehicle(this);
		}
	}

}
