package com.anand.structural.composit;

public class CompositClient {

	public static void main(String[] args) {

		ServiceProvider serviceProvider = new ServiceProvider(); 
		
		Service employeeService1 = new EmployeeService();
		Service employeeService2 = new EmployeeService();
		Service adminService = new AdminService();
		
		serviceProvider.addService(employeeService1);
		serviceProvider.addService(employeeService2);
		serviceProvider.addService(adminService);
		
		serviceProvider.service("Registration Service");
		
		
	}

}
