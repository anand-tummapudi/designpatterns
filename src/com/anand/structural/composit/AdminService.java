package com.anand.structural.composit;

public class AdminService implements Service {

	@Override
	public void service(String serviceType) {
		System.out.println("Admin Service:"+serviceType);
		
	}

}
