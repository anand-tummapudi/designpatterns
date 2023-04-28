package com.anand.creational.prototype;

import java.util.List;

public class PrototypeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO eDao = new EmployeeDAO();
		List<Employee> empList  = eDao.getEmployees();
		
		System.out.println("Employee List");
		empList.forEach(System.out::println);
		
		try {
			List<Employee> updatedList = eDao.clone();
			Employee e = new Employee();
			e.setEmployeeId("E3");
			e.setEmpoyeeName("EmployeeName3");
			e.setEmployeeSalary(26000);
			
			updatedList.add(e);
			
			System.out.println("Updated Employee List");
			updatedList.forEach(System.out::println);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
