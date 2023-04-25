package com.anand.creational.factory;

public class FactoryImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OSFactory osFactory = new OSFactory();
		OS os = osFactory.getOs("windows");
		os.spec();
		
		
	}

}
