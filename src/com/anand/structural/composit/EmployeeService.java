package com.anand.structural.composit;

public class EmployeeService implements Service{

	@Override
	public void service(String serviceType) {
		System.out.println("Employee Service:"+serviceType);
	}
	

}
